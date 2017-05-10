package uconverter.converters.length;

public class MilesConverter extends AbstractLengthConverter {
    @Override
    public String getName() {
        return "Miles";
    }

    @Override
    public double toSI(double miles) {
        return miles / 0.00062137d;
    }

    @Override
    public double fromSI(double meters) {
        return meters * 0.00062137;
    }
}
