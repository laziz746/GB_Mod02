package com.khai.java2_lesson4_21072022;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField messTxt;
    @FXML
    private TextArea result;
    @FXML
    private ListView<?> users;

    @FXML
    void send(ActionEvent event) {
        result.insertText(0, messTxt.getText() + "\n");
        messTxt.clear();
    }

    @FXML
    void textA(ActionEvent event) {

        result.insertText(0, messTxt.getText() + "\n");
        messTxt.clear();
    }

}
