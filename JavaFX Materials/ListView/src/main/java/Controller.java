import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;

    String[] menu = {"Pizza", "Sushi", "Ramen", "Curry", "Pasta", "Burger", "Fries", "Chocolate Shake", "Mango Shake"};

    String currentFood;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myListView.getItems().addAll(menu);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentFood = myListView.getSelectionModel().getSelectedItem();
                myLabel.setText("Selected Item: " + currentFood);
            }
        });
    }
}