package observer;

import java.util.ArrayList;
import java.util.List;

import cache.ResultType;

public abstract class CachePublisher {
    List<Observer> observers;
    public CachePublisher() {
        observers = new ArrayList<>();
    }

    public abstract void addObserver(Observer observer);
    public abstract void notifyObserver();
    public abstract void notifyObserver(ResultType resultType);

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

}
