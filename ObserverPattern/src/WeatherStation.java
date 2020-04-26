public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay cd = new CurrentConditionDisplay(weatherData);
        ForecastDisplay fd1 = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(39.1f, 70.6f, 32.0f);
        weatherData.setMeasurements(40.1f, 70.6f, 29.0f);
        weatherData.setMeasurements(45.1f, 72.6f, 9.0f);
        cd.unsubscribe();
        weatherData.setMeasurements(47.1f, 75.6f, 39.0f);
    }
}
