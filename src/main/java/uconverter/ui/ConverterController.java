package uconverter.ui;


import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import uconverter.converters.core.UnitConverter;
import uconverter.converters.core.UnitType;
import uconverter.converters.core.UniversalConverter;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterController {
    private UniversalConverter converter = new UniversalConverter();
    public ComboBox<UnitConverter> srcUnit;
    public ComboBox<UnitConverter> trgUnit;
    public TextField srcValue;
    public TextField trgValue;

    public void init(UnitType t) {
        List<UnitConverter> units =
                converter.getConverters().stream()
                        .filter(c -> c.getUnitType() == t)
                        .collect(Collectors.toList());
        srcUnit.getItems().setAll(units);
        trgUnit.getItems().setAll(units);
    }

    public void convert(ActionEvent actionEvent) {
        String s = srcValue.getText();
        double val = Double.parseDouble(s);
        UnitConverter src = srcUnit.getValue();
        UnitConverter trg = trgUnit.getValue();

        double result = converter.convert(src, trg, val);

        String strResult = Double.toString(result);
        trgValue.setText(strResult);
    }
}
