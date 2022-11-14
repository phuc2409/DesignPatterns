package factory_method;

public class WeatherFactory {

    private WeatherFactory() {
    }

    public static IWeather getWeather(WeatherType weatherType) {
        if (weatherType == WeatherType.ACCU_WEATHER) {
            return new AccuWeather();
        }
        else if (weatherType == WeatherType.DARK_SKY) {
            return new DarkSky();
        }
        else {
            throw new IllegalArgumentException("Loại thời tiết không hợp lệ");
        }
    }
}
