package cache;

import java.util.*;

import models.Movie;

public class LFUCache extends Cache {

    private PriorityQueue<CacheEntry> entries = new PriorityQueue<>(new Comparator<>() {
        @Override
        public int compare(CacheEntry o1, CacheEntry o2) {
            return o1.frequency - o2.frequency;
        }
    });
    private Map<Long, CacheEntry> map = new HashMap<>();
    private List<Movie> movies = new ArrayList<>();

    public LFUCache() {
        setCapacity(CacheConfig.getLFU_CAPACITY());
    }

    public void addEntry(Movie movie) {
        if (movies.size() >= getCapacity()) {
            evict();
        } else {
            add(movie);
        }
    } 

    @Override
    public void evict() {
        CacheEntry entry = entries.poll();
        movies.removeIf(it-> it.getId() == entry.getMovieId());
        map.remove(entry.getMovieId());
    }

    @Override
    public void add(Movie movie) {
        CacheEntry entry = new CacheEntry(0, movie.getId());
        map.put(movie.getId(), entry);
        movies.add(movie);
        entries.add(entry);
    }

    @Override
    public void updateCache(Movie movie) {
        CacheEntry entry = map.get(movie.getId());
        entries.remove(entry);
        map.remove(movie.getId());
        add(movie);
    }
    
    public List<Movie> getMovies() {
        return movies;
    }

    public static class CacheEntry {
        private int frequency;
        private long movieId;
        public int getFrequency() {
            return frequency;
        }
        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }
        public long getMovieId() {
            return movieId;
        }
        public void setMovieId(long movieId) {
            this.movieId = movieId;
        }
        public CacheEntry(int frequency, long movieId) {
            this.frequency = frequency;
            this.movieId = movieId;
        }
    }
   
}
