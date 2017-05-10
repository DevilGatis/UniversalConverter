package uconverter.converters.weight;

public class PoundConverter extends AbstractWeightConverter {

    private static final double CONST = 2.2046;

    @Override
    public String getName() {
        return "Pounds";
    }

    @Override
    public double toSI(double lb) {
        return lb / CONST;
    }

    @Override
    public double fromSI(double kg) {
        return kg * CONST;
    }
}
