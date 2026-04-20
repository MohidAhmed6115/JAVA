import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.text.html.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private javafx.scene.image.ImageView myImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // translate
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(myImage);

        translate.setDuration(Duration.millis(2300));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(250);
        translate.setByY(-100);
        translate.setAutoReverse(true);
        translate.play();

        // rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(myImage);

        rotate.setDuration(Duration.millis(3000));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.play();

        // fade
        FadeTransition fade = new FadeTransition();
        fade.setNode(myImage);

        fade.setDuration(Duration.millis(3000));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(1);
        fade.setToValue(0.4);
        fade.setAutoReverse(true);
        fade.play();

        // scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImage);

        scale.setDuration(Duration.millis(3000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(1.2);
        scale.setByY(2);
        scale.setAutoReverse(true);
        scale.play();
    }
}