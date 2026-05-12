package com.example.sudoku;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sudoku-view.fxml"));
        primaryStage.setScene(new Scene(loader.load(), 700, 600));
        primaryStage.setTitle("Sudoku 6x6");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/* Hola caracola
* Te parecen bien 47 cm*

112233 holaaaa/
 */