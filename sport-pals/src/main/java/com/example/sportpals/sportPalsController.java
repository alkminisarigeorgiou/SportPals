package com.example.sportpals;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class sportPalsController implements Initializable {

    private boolean logInVisible = true;

    @FXML
    private Label btnSignUp;

    @FXML
    private Pane pnSignIn;

    @FXML
    private Pane pnSignUp;

    @FXML
    private Label btnBackSignUp;

    @FXML
    private ComboBox<String> cityComboBox;

    @FXML
    private ComboBox<String> sportsComboBox;

    @FXML
    void changeWindow(ActionEvent event) {

    }

    @FXML
    void createAccount(MouseEvent event) {
        pnSignIn.setVisible(!logInVisible);
        pnSignIn.setDisable(logInVisible);
        pnSignUp.setVisible(logInVisible);
        pnSignUp.setDisable(!logInVisible);
    }

    @FXML
    void signInPane(MouseEvent event) {
        pnSignIn.setVisible(logInVisible);
        pnSignIn.setDisable(!logInVisible);
        pnSignUp.setVisible(!logInVisible);
        pnSignUp.setDisable(logInVisible);
    }
    //Set strings to ComboBox
    private String[] city = {"Athens", "Thesalloniki", "Patra"};
    private String[] sports = {"Football", "Basketball", "Tennis"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cityComboBox.getItems().addAll(city);
        sportsComboBox.getItems().addAll(sports);
    }
    //end ComboBox
}