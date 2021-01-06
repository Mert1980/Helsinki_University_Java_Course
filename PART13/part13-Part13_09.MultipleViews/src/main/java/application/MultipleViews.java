package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        Application.launch(MultipleViews.class);
    }

   @Override
    public void start(Stage stage) throws Exception {
 
        Button firstButton = new Button("To the first view!");
        Button secondButton = new Button("To the second view!");
        Button thirdButton = new Button("To the third view!");
 
        BorderPane firstLayout = new BorderPane();
        firstLayout.setTop(new Label("First view!"));
        firstLayout.setCenter(secondButton);
 
        VBox secondLayout = new VBox();
        secondLayout.getChildren().addAll(thirdButton, new Label("Second view!"));
 
        GridPane thirdLayout = new GridPane();
        thirdLayout.add(new Label("Third view!"), 0, 0);
        thirdLayout.add(firstButton, 1, 1);
 
        Scene first = new Scene(firstLayout);
        Scene second = new Scene(secondLayout);
        Scene third = new Scene(thirdLayout);
 
        firstButton.setOnAction((event) -> {
            stage.setScene(first);
        });
 
        secondButton.setOnAction((event) -> {
            stage.setScene(second);
        });
 
        thirdButton.setOnAction((event) -> {
            stage.setScene(third);
        });
 
        stage.setScene(first);
        stage.show();

    }

}
