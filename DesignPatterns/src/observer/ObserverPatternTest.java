package observer;

import observer.concrete_observers.CurrentConditionDisplay;
import observer.concrete_observers.StaticDisplay;
import observer.concrete_subject.WeatherData;
import observer.observers.Observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // concrete-subect
        Observer staticDisplay = new StaticDisplay(weatherData);
        Observer currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(308.3f, 65.0f, 45.0f);
        weatherData.setMeasurements(276.5f, 56.6f, 35.f);
    }
}
