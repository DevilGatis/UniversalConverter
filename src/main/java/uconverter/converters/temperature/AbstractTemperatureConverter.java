package uconverter.converters.temperature;

import uconverter.core.UnitConverter;
import uconverter.core.UnitType;

public abstract class AbstractTemperatureConverter extends UnitConverter {
    @Override
    public UnitType getUnitType() {
        return UnitType.TEMPERATURE;
    }
}
