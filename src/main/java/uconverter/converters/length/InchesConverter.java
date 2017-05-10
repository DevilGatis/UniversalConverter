package uconverter.converters.length;

public class InchesConverter extends AbstractLengthConverter {

    @Override
    public String getName() {
        return "Inches";
    }

    @Override
    public double toSI(double inches) {
        return inches / 39.37;
    }

    @Override
    public double fromSI(double meters) {
        return meters * 39.37;
    }
}
