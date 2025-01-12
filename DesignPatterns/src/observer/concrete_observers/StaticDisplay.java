package observer.concrete_observers;

import javax.security.auth.Subject;

import observer.concrete_subject.WeatherData;
import observer.display.DisplayElement;
import observer.observers.Observer;

/**
 * Display min, max and average temperature
 */
public class StaticDisplay implements Observer, DisplayElement {

    private float minTemp;
    private float maxTemp;
    private float avgTemp;
    private float subTemp;
    private float readingCount;

    private WeatherData weatherData;

    public StaticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        ++ readingCount;
        if (temperature < minTemp) minTemp = temperature;
        if (temperature > maxTemp) maxTemp = temperature;
        subTemp += temperature;
        avgTemp = subTemp / readingCount;
        display();
    }

    @Override
    public void display() {
        System.out.println("max : min : avg temperature / " + 
            maxTemp + " : " + minTemp + " : " + avgTemp);
    }

    @Override
    public void subscribe(Subject subject) {
        
    }
    
}
