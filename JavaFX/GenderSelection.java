import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GenderSelection extends Application {
    public void start(Stage stage) {
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group);

        Label label = new Label("Select Gender");

        male.setOnAction(e -> label.setText("Selected Gender: Male"));
        female.setOnAction(e -> label.setText("Selected Gender: Female"));

        VBox root = new VBox(10, male, female, label);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root, 250, 150));
        stage.setTitle("Gender Selection");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
