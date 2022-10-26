package observer;

import observer.display.CurrentConditionsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        //We can have other displays (observers) that accept weatherData (subject).
        weatherData.setMeasurements(80, 20, 42.f);
        weatherData.setMeasurements(40, 30, 32.f);
    }
}
