public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject o) {
        WeatherData weatherData = (WeatherData) o;
        this.humidity = weatherData.getHumidity();
        this.temperature = weatherData.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "C degrees and " + humidity + "% humidity!");
    }

    void unsubscribe() {
        weatherData.removeObserver(this);
    }
}
