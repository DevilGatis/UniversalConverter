package uconverter.converters.temperature;

public class KelvinConverter extends AbstractTemperatureConverter {
    @Override
    public double toSI(double value) {
        return value;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue;
    }

    @Override
    public String getName() {
        return "Kelvin";
    }
}
