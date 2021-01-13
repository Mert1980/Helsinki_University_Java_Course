package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TicTacToeApplicationV1 extends Application {

    String currentPlayer = "X";
    String nextPlayer = "O";
    GridPane gameTable = new GridPane();
    Button playBtn1 = new Button();
    Button playBtn2 = new Button();
    Button playBtn3 = new Button();
    Button playBtn4 = new Button();
    Button playBtn5 = new Button();
    Button playBtn6 = new Button();
    Button playBtn7 = new Button();
    Button playBtn8 = new Button();
    Button playBtn9 = new Button();

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public String getNextPlayer() {
        return getCurrentPlayer().equals("X") ? "0" : "X";
    }

    public boolean isGameEnd() {

        if (isHorizontalEqual() || isVerticalEqual() || isDiagonalEqual()) {
            return true;
        }

        return false;
    }

    public boolean isVerticalEqual() {
        if (!playBtn1.getText().isEmpty() && playBtn1.getText().equals(playBtn2.getText())
                && playBtn2.getText().equals(playBtn3.getText())) {
            return true;
        }

        if (!playBtn4.getText().isEmpty() && playBtn4.getText().equals(playBtn5.getText())
                && playBtn5.getText().equals(playBtn6.getText())) {
            return true;
        }

        if (!playBtn7.getText().isEmpty() && playBtn7.getText().equals(playBtn8.getText())
                && playBtn8.getText().equals(playBtn9.getText())) {
            return true;
        }

        return false;
    }

    public boolean isHorizontalEqual() {
        if (!playBtn1.getText().isEmpty() && playBtn1.getText().equals(playBtn4.getText())
                && playBtn4.getText().equals(playBtn7.getText())) {
            return true;
        }

        if (!playBtn2.getText().isEmpty() && playBtn2.getText().equals(playBtn5.getText())
                && playBtn5.getText().equals(playBtn8.getText())) {
            return true;
        }

        if (!playBtn3.getText().isEmpty() && playBtn3.getText().equals(playBtn6.getText())
                && playBtn6.getText().equals(playBtn9.getText())) {
            return true;
        }

        return false;
    }

    public boolean isDiagonalEqual() {
        if (!playBtn1.getText().isEmpty() && playBtn1.getText().equals(playBtn5.getText())
                && playBtn5.getText().equals(playBtn9.getText())) {
            return true;
        }

        if (!playBtn3.getText().isEmpty() && playBtn3.getText().equals(playBtn5.getText())
                && playBtn5.getText().equals(playBtn7.getText())) {
            return true;
        }

        return false;
    }

    public void handleButtonClick(Button button, Label info) {

        String selection = button.getText();

        if (!info.getText().equalsIgnoreCase("The end!")
                && selection.isEmpty()
                && getCurrentPlayer().equals("X")) {
            button.setText("X");
            info.setText("Turn: O");
            setCurrentPlayer("O");

        } else if (!info.getText().equalsIgnoreCase("The end!")
                && selection.isEmpty()
                && getCurrentPlayer().equals("O")) {
            button.setText("O");
            info.setText("Turn: X");
            setCurrentPlayer("X");

        }

        if (isGameEnd()) {
            info.setText("The end!");
        }

    }

    @Override
    public void start(Stage stage) throws Exception {

        // Create the inner layout
        Label info = new Label("Turn: X");
        info.setFont(Font.font("Monospaced", 40));

        playBtn1.setFont(Font.font("Monospaced", 60));

        playBtn1.setOnMouseClicked(event -> {

            System.out.println("Button1");
            handleButtonClick(playBtn1, info);

        });

        playBtn2.setFont(Font.font("Monospaced", 60));
        playBtn2.setOnMouseClicked(event -> {

            System.out.println("Button2");
            handleButtonClick(playBtn2, info);

        });

        playBtn3.setFont(Font.font("Monospaced", 60));
        playBtn3.setOnMouseClicked(event -> {

            System.out.println("Button3");
            handleButtonClick(playBtn3, info);

        });

        playBtn4.setFont(Font.font("Monospaced", 60));
        playBtn4.setOnMouseClicked(event -> {

            System.out.println("Button4");

            handleButtonClick(playBtn4, info);
        });

        playBtn5.setFont(Font.font("Monospaced", 60));
        playBtn5.setOnMouseClicked(event -> {

            System.out.println("Button5");
            handleButtonClick(playBtn5, info);
        });

        playBtn6.setFont(Font.font("Monospaced", 60));
        playBtn6.setOnMouseClicked(event -> {

            System.out.println("Button6");
            handleButtonClick(playBtn6, info);
        });

        playBtn7.setFont(Font.font("Monospaced", 60));
        playBtn7.setOnMouseClicked(event -> {

            System.out.println("Button7");
            handleButtonClick(playBtn7, info);
        });

        playBtn8.setFont(Font.font("Monospaced", 60));
        playBtn8.setOnMouseClicked(event -> {

            System.out.println("Button8");
            handleButtonClick(playBtn8, info);
        });

        playBtn9.setFont(Font.font("Monospaced", 60));
        playBtn9.setOnMouseClicked(event -> {

            System.out.println("Button9");
            handleButtonClick(playBtn9, info);
        });

        gameTable.add(playBtn1, 0, 0);
        gameTable.add(playBtn2, 0, 1);
        gameTable.add(playBtn3, 0, 2);
        gameTable.add(playBtn4, 1, 0);
        gameTable.add(playBtn5, 1, 1);
        gameTable.add(playBtn6, 1, 2);
        gameTable.add(playBtn7, 2, 0);
        gameTable.add(playBtn8, 2, 1);
        gameTable.add(playBtn9, 2, 2);

        gameTable.setAlignment(Pos.CENTER);
        gameTable.setVgap(10);
        gameTable.setHgap(10);
        gameTable.setPadding(new Insets(20, 20, 20, 20));

        BorderPane layout = new BorderPane();
        layout.setTop(info);
        layout.setCenter(gameTable);
        layout.setPadding(new Insets(10, 10, 10, 10));

        // Create the main view and add the high level layout
        Scene view = new Scene(layout, 450, 450);

        // Show the application
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(TicTacToeApplicationV1.class);
    }

}
