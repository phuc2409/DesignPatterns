package factory_method;

public class DarkSky implements IWeather {

    @Override
    public String getName() {
        return "DarkSky";
    }
}
