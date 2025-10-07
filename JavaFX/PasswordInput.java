import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordInput extends Application {
    public void start(Stage stage) {
        PasswordField pf = new PasswordField();
        Label label = new Label();

        pf.setOnAction(e -> label.setText("Password Entered!"));

        VBox root = new VBox(10, pf, label);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root, 250, 100));
        stage.setTitle("Password Input");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
