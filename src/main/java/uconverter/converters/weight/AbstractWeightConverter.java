package uconverter.converters.weight;

import uconverter.converters.core.UnitConverter;
import uconverter.converters.core.UnitType;

public abstract class AbstractWeightConverter extends UnitConverter {
    @Override
    public UnitType getUnitType() {
        return UnitType.WEIGHT;
    }
}
