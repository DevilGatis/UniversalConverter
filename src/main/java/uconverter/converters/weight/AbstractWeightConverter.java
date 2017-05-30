package uconverter.converters.weight;

import uconverter.core.UnitConverter;
import uconverter.core.UnitType;

public abstract class AbstractWeightConverter extends UnitConverter {
    @Override
    public UnitType getUnitType() {
        return UnitType.WEIGHT;
    }
}
