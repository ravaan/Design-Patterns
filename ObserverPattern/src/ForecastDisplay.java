public class ForecastDisplay implements Observer, Display {
    private float lastPressure;
    private float currentPressure;
    private Subject weatherData;

    ForecastDisplay(Subject weatherData) {
        this.currentPressure = 30.0f;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(lastPressure >= currentPressure ? "Conditions are still getting worse!" : "Conditions have started to improve!");
    }

    @Override
    public void update(Subject o) {
        WeatherData weatherData = (WeatherData) o;
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    public void unsubscribe() {
        weatherData.removeObserver(this);
    }
}
