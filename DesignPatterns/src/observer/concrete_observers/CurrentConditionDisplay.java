package observer.concrete_observers;

import javax.security.auth.Subject;

import observer.concrete_subject.WeatherData;
import observer.display.DisplayElement;
import observer.observers.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current temperature:" + temperature + "degree C, humidity:" + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void subscribe(Subject subject) {

    }
    
}
