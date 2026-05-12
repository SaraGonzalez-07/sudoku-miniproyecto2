package com.example.sudoku.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;

public class SudokuController {

    @FXML
    private GridPane sudokuGrid;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                TextField celda = new TextField();
                celda.setPrefSize(50, 50);
                celda.getStyleClass().add("text-field");
                sudokuGrid.add(celda, j, i);
            }
        }
    }

    @FXML
    private void handleHelp(ActionEvent event) {
    }

    @FXML
    private void handleNewGame(ActionEvent event) {
    }
}