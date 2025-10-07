import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextTransfer extends Application {
    public void start(Stage stage) {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Button submit = new Button("Submit");

        submit.setOnAction(e -> tf2.setText(tf1.getText()));

        VBox root = new VBox(10, tf1, submit, tf2);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root, 300, 150));
        stage.setTitle("Text Transfer");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
