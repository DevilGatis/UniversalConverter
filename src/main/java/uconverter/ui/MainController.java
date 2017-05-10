package uconverter.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import uconverter.converters.core.UnitType;

import java.io.IOException;

public class MainController {

    public TabPane tabs;

    public void initialize() throws IOException {
        for (UnitType t : UnitType.values()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/converter_tab.fxml"));
            loader.load();

            ConverterController controller = loader.getController();
            controller.init(t);
            Parent parent = loader.getRoot();

            Tab tab = new Tab(t.getLabel());
            tab.setContent(parent);
            tab.setClosable(false);

            tabs.getTabs().add(tab);
        }
    }
}
