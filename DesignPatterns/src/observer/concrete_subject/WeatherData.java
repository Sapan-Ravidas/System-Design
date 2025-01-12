package observer.concrete_subject;

import java.util.ArrayList;
import java.util.List;

import observer.observers.Observer;
import observer.subject.Subject;

public class WeatherData implements Subject {
    List<Observer> subscibers;
    float temperature;
    float pressure;
    float humidity;

    public WeatherData() {
        subscibers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        subscibers.add(o);
    }

    @Override
    public void notifiyObservers() {
        for (Observer o : subscibers)
            o.update(temperature, humidity, pressure);
    }

    @Override
    public void removeObserver(Observer o) {
        subscibers.remove(o);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    /**
     * set weather params with updated values and notify all subscribers that data has changed
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifiyObservers();
    }
}
