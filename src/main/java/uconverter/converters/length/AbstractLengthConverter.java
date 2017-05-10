package uconverter.converters.length;

import uconverter.converters.core.UnitConverter;
import uconverter.converters.core.UnitType;

public abstract class AbstractLengthConverter extends UnitConverter {
    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
