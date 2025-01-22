package cache;

import java.util.ArrayList;
import java.util.List;

import models.Movie;

public class LRUCache extends Cache {

    List<Movie> movies = new ArrayList<>();

    public LRUCache() {
        setCapacity(CacheConfig.getLRU_CAPACITY());
    }

    @Override
    public void evict() {
        movies.remove(movies.size() - 1);
    }

    @Override
    public void add(Movie movie) {
        if (movies.size() >= getCapacity()) {
            evict();
        } else {
            movies.add(0, movie);
        }
    }

    @Override
    public void updateCache(Movie movie) {
        movies.remove(movie);
        add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }
    
}
