package factory_method;

public class AccuWeather implements IWeather {

    @Override
    public String getName() {
        return "AccuWeather";
    }
}
