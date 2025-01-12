package observer.subject;

import observer.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifiyObservers();
    void removeObserver(Observer o);
}
