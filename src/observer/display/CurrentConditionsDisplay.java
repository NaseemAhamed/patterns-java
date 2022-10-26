package observer.display;

import observer.Observer;
import observer.WeatherData;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData=weatherData; // In the future we may want to un-register ourselves as an observer and it would be handy to already have a reference to the subject.
        weatherData.registerObserver(this);
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temperature=temp;
//        this.humidity=humidity;
//        this.pressure=pressure;
//        this.display();
//    }

    public void update() {
        this.temperature=weatherData.getTemperature();
        this.humidity=weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature " + temperature + "; Humidity: " + humidity + "; Pressure: " + pressure);
    }
}
