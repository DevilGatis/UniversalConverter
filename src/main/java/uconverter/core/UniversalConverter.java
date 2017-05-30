package uconverter.core;

import asg.cliche.Command;
import uconverter.converters.length.InchesConverter;
import uconverter.converters.length.MetersConverter;
import uconverter.converters.length.MilesConverter;
import uconverter.converters.temperature.CelsiusConverter;
import uconverter.converters.temperature.FahrenheitConverter;
import uconverter.converters.temperature.KelvinConverter;
import uconverter.converters.weight.KilogramsConverter;
import uconverter.converters.weight.PoundConverter;
import uconverter.converters.weight.TonsConverter;

import java.util.Arrays;
import java.util.List;

public class UniversalConverter {
    private final List<UnitConverter> converters = Arrays.asList(
            new CelsiusConverter(),
            new FahrenheitConverter(),
            new KelvinConverter(),
            new InchesConverter(),
            new MetersConverter(),
            new MilesConverter(),
            new KilogramsConverter(),
            new PoundConverter(),
            new TonsConverter()
    );
    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;

    @Command
    public void list() {
        for (int i = 0; i < converters.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, converters.get(i));
        }
    }

    public List<UnitConverter> getConverters() {
        return converters;
    }

    @Command
    public void source(int idx) {
        sourceConverter = converters.get(idx - 1);
    }

    @Command
    public void target(int idx) {
        targetConverter = converters.get(idx - 1);
    }

    public UnitConverter getSourceConverter() {
        return sourceConverter;
    }

    public UnitConverter getTargetConverter() {
        return targetConverter;
    }

    @Command
    public double convert(double value) {
        UnitConverter src = getSourceConverter();
        UnitConverter trg = getTargetConverter();
        if (src == null && trg == null) {
            throw new IllegalStateException("Source and Target converters are not set");
        }
        if (src == null) {
            throw new IllegalStateException("Source converter is not set");
        }
        if (trg == null) {
            throw new IllegalStateException("Target converter is not set");
        }
        if (src.getUnitType() != trg.getUnitType()) {
            throw new IllegalStateException("Source and Target converters are of different types");
        }
        return convert(src, trg, value);
    }

    public double convert(UnitConverter src, UnitConverter trg, double value) {
        double si = src.toSI(value);
        return trg.fromSI(si);
    }
}

