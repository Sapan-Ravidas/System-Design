package cache;

import java.util.*;
import java.util.function.Predicate;

import models.Movie;
import observer.CachePublisher;
import observer.Observer;

public class CacheManager extends CachePublisher{

    private static volatile CacheManager instance = null;

    private Map<Long, LRUCache> userCache = new HashMap<>();
    private LFUCache lfuCache = new LFUCache();

    private CacheManager() {
        super();
    }

    public static CacheManager getInstance() {
        if (instance == null) {
            synchronized(CacheManager.class) {
                if (instance == null) {
                    instance = new CacheManager();
                }
            }
        }
        return instance;
    }

    public void registerUserCache(Long userId) {
        userCache.put(userId, new LRUCache());
    }

    public void registerMovie(Movie movie) {
        lfuCache.addEntry(movie);
    }

    public boolean search(Long uId, String value) {
        notifyObserver();
        Predicate<Movie> moviePredicate = movie -> movie.getGenre().equalsIgnoreCase(value);
        if (l1Search(uId, moviePredicate)) {
            notifyObserver(ResultType.L1_HIT);
        } else if (l2Search(moviePredicate)) {
            notifyObserver(ResultType.L2_HIT);
        } else if (primaryStorageSearch(moviePredicate)) {
            notifyObserver(ResultType.STORAGE_HIT);
        } else {
            return false;
        }
        return true;
    }

    public boolean searchMulti(long userId, String genre, String year, double rating) {
        notifyObserver();
        Predicate<Movie> genPredicate = movie -> movie.getGenre().equalsIgnoreCase(genre);
        Predicate<Movie> yearPredicate = movie -> movie.getYear().equals(year);
        Predicate<Movie> ratingPredicate = movie -> movie.getRating() >= rating;
        Predicate<Movie> predicate = genPredicate
                                .and(yearPredicate)
                                .and(ratingPredicate);
        if (l1Search(userId, predicate)) {
            notifyObserver(ResultType.L1_HIT);
        } else if (l2Search(predicate)) {
            notifyObserver(ResultType.L2_HIT);
        } else if (primaryStorageSearch(predicate)) {
            notifyObserver(ResultType.STORAGE_HIT);
        } else {
            return false;
        }
        return true;
    }

    public boolean l1Search(Long userId, Predicate<Movie> predicate) {
        LRUCache cache = userCache.computeIfAbsent(userId, key -> new LRUCache());
        List<Movie> movies = cache.getMovies().stream()
                                .filter(predicate)
                                .toList();
        if (!movies.isEmpty()) {
            displayCacheHit(userId, movies, CacheLevel.L1);
        }
        return !movies.isEmpty();
            
    }

    public boolean l2Search(Predicate<Movie> predicate) {
        List<Movie> movies = lfuCache.getMovies().stream()
                                .filter(predicate)
                                .toList();
        if (!movies.isEmpty()){
            displayCacheHit(null, movies, CacheLevel.L2);
        }
        return !movies.isEmpty() ;
    }

    public boolean primaryStorageSearch(Predicate<Movie> predicate) {
        boolean[] flag = {false};
        return flag[0];
    }

    private void displayCacheHit(Long id, List<Movie> movies, CacheLevel level) {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " found in " + level);
            switch (level) {
                case L1:
                    userCache.get(id).updateCache(movie);
                    break;
                case L2:
                    lfuCache.updateCache(movie);
                    break;
                default:
                    break;
            }
        }
    }

    public void crearL1Cache() {
        userCache = new HashMap<>();
    }

    public void createL2Cache() {
        lfuCache = new LFUCache();
    }

    @Override
    public void addObserver(Observer observer) {
        getObservers().add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: getObservers()) {
            observer.notifySearch();
        }
    }

    @Override
    public void notifyObserver(ResultType resultType) {
        for (Observer observer: getObservers()) {
            observer.notifySearch(resultType);
        }
    }
}
