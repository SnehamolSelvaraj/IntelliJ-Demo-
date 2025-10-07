import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

import java.util.Random;

public class DynamicBackground extends Application {
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20;");
        Button button = new Button("Change Color");

        Random rand = new Random();

        button.setOnAction(e -> {
            Color color = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
            root.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, null)));
        });

        root.getChildren().add(button);
        stage.setScene(new Scene(root, 300, 150));
        stage.setTitle("Dynamic Background Color");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
