import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Scene.fxml"));
            Parent root = loader.load();
            Controller controller = loader.getController();
            Scene scene = new Scene(root);

            // Method 01
//            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//                @Override
//                public void handle(KeyEvent event) {
//                    switch(event.getCode()) {
//                        case UP -> controller.moveUp();
//                        case DOWN -> controller.moveDown();
//                        case LEFT -> controller.moveLeft();
//                        case RIGHT -> controller.moveRight();
//                    }
//                }
//            });

            // Method 02
            scene.setOnKeyPressed(event -> {
                    switch(event.getCode()) {
                        case UP -> controller.moveUp();
                        case DOWN -> controller.moveDown();
                        case LEFT -> controller.moveLeft();
                        case RIGHT -> controller.moveRight();
                    }
            });

            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}