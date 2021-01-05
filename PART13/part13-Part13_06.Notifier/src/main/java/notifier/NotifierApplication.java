package notifier;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {

        TextField upperText = new TextField();
        Button button = new Button("Update");
        Label lowerTextLabel = new Label();

        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(upperText, button, lowerTextLabel);

        button.setOnAction((event) -> {
            lowerTextLabel.setText(upperText.getText());
        });

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();

    }

}
