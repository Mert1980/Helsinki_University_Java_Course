package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");

        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(letters);
        texts.getChildren().add(words);
        texts.getChildren().add(longestWord);

        TextArea textArea = new TextArea("");

        //creates an eventlistener for the text field, to keep track of the length of the strings being inputed in real time
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length(); //counts the total characters in the text field
            String[] parts = newValue.split(" "); //separates the characters into words in a string array
            int wordsCount = parts.length; //sets an int variable of the length of the string array (number of words)
            String longest = Arrays.stream(parts) //uses the sorted method to compare the length of all strings and return the longest one
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            //sets the values of all 3 labels to the new variables created during the eventlisteners
            letters.setText("Letters: " + characters);
            words.setText("Words: " + wordsCount);
            longestWord.setText("The longest word is: " + longest);
        });

        layout.setBottom(texts);
        layout.setCenter(textArea);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}
