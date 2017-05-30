package uconverter.core;

public enum UnitType {
    TEMPERATURE("Temperature"),
    LENGTH("Length"),
    WEIGHT("Weight");

    private final String label;

    UnitType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
