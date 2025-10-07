import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    public void start(Stage stage) {
        Label label = new Label();
        Button button = new Button("Click Me");

        button.setOnAction(e -> label.setText("Hello JavaFX"));

        VBox root = new VBox(10, button, label);
        root.setStyle("-fx-padding: 20;");
        Scene scene = new Scene(root, 250, 100);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
