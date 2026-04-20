import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Pane myPane;
    @FXML
    private ColorPicker myColorPicker;

    public void changeColor(ActionEvent event) {
        Color myColor = myColorPicker.getValue();
        myPane.setBackground(new Background((new BackgroundFill(myColor, null, null))));
    }
}