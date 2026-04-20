import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] roles = {"Project Lead", "Story Lead", "UI Lead"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(roles);
        myChoiceBox.setOnAction(this::chooseRole);
    }

    public void chooseRole(ActionEvent event) {
        String myRole = myChoiceBox.getValue();
        myLabel.setText("You have been assigned to role of "+ myRole);
    }
}