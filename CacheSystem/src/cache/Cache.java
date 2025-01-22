package cache;

import models.Movie;

public abstract class Cache {
    private int capacity;
    public Cache() {
        
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public abstract void evict();
    public abstract void add(Movie movie);
    public abstract void updateCache(Movie movie);
}
