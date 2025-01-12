package observer.observers;

import javax.security.auth.Subject;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
    void subscribe(Subject subject);
}
