package uconverter.converters.length;

import uconverter.core.UnitConverter;
import uconverter.core.UnitType;

public abstract class AbstractLengthConverter extends UnitConverter {
    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
