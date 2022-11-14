package factory_method;

public class Main {

    public static void main(String[] args) {
        IWeather weather = WeatherFactory.getWeather(WeatherType.ACCU_WEATHER);
        System.out.println(weather.getName());
    }
}
