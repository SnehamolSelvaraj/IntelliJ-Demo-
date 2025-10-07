import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextDisplayClear extends Application {
    public void start(Stage stage) {
        TextField tf = new TextField();
        Label label = new Label();

        Button showBtn = new Button("Show");
        Button clearBtn = new Button("Clear");

        showBtn.setOnAction(e -> label.setText(tf.getText()));
        clearBtn.setOnAction(e -> {
            tf.clear();
            label.setText("");
        });

        HBox buttons = new HBox(10, showBtn, clearBtn);
        VBox root = new VBox(10, tf, buttons, label);
        root.setStyle("-fx-padding: 20;");

        stage.setScene(new Scene(root, 300, 150));
        stage.setTitle("Text Display & Clearing");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
