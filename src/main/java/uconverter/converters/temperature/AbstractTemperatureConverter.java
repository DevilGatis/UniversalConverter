package uconverter.converters.temperature;

import uconverter.converters.core.UnitConverter;
import uconverter.converters.core.UnitType;

public abstract class AbstractTemperatureConverter extends UnitConverter {
    @Override
    public UnitType getUnitType() {
        return UnitType.TEMPERATURE;
    }
}
