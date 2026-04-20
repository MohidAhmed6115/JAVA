import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    public AnchorPane scenePane;
    @FXML
    ImageView myImageView;
    public Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("/Blue Cosmos.png"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }
}