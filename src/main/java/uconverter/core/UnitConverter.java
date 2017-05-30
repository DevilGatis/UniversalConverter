package uconverter.core;

public abstract class UnitConverter {
    public double toSI(double value) {
        return value;
    }

    public double fromSI(double siValue) {
        return siValue;
    }

    public abstract String getName();

    public abstract UnitType getUnitType();

    @Override
    public String toString() {
        return getName();
    }
}
