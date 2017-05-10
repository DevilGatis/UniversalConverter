package uconverter.converters.weight;

public class TonsConverter extends AbstractWeightConverter {
    @Override
    public String getName() {
        return "Tons";
    }

    @Override
    public double toSI(double tons) {
        return tons * 1000;
    }

    @Override
    public double fromSI(double kg) {
        return kg / 1000;
    }
}
