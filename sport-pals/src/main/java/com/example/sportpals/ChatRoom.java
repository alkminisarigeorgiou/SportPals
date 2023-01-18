package com.example.sportpals;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class ChatRoom {


    @FXML
    private ImageView groupImageView;

    @FXML
    private ImageView messageImageView;

    @FXML
    private ImageView settingsImageView;

    @FXML
    private ImageView userImageView;

    @FXML
    private ImageView logOutImageView;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label headUsernameLbl;

    Stage stage;

    @FXML
    void messageBtn(MouseEvent event) {
        Image userImageBlack = new Image(getClass().getResourceAsStream("icons/user-black.png"));
        userImageView.setImage(userImageBlack);
        Image messageImageWhite = new Image(getClass().getResourceAsStream("icons/messages.png"));
        messageImageView.setImage(messageImageWhite);
        Image gearImageBlack = new Image(getClass().getResourceAsStream("icons/gear-black.png"));
        settingsImageView.setImage(gearImageBlack);
        Image groupImageBlack = new Image(getClass().getResourceAsStream("icons/groups-black.png"));
        groupImageView.setImage(groupImageBlack);
    }

    @FXML
    void userBtn(MouseEvent event) {
        Image userImageWhite = new Image(getClass().getResourceAsStream("icons/user.png"));
        userImageView.setImage(userImageWhite);
        Image messageImageBlack = new Image(getClass().getResourceAsStream("icons/messages-black.png"));
        messageImageView.setImage(messageImageBlack);
        Image gearImageBlack = new Image(getClass().getResourceAsStream("icons/gear-black.png"));
        settingsImageView.setImage(gearImageBlack);
        Image groupImageBlack = new Image(getClass().getResourceAsStream("icons/groups-black.png"));
        groupImageView.setImage(groupImageBlack);

    }

    @FXML
    void groupBtn(MouseEvent event) {
        Image userImageBlack = new Image(getClass().getResourceAsStream("icons/user-black.png"));
        userImageView.setImage(userImageBlack);
        Image messageImageBlack = new Image(getClass().getResourceAsStream("icons/messages-black.png"));
        messageImageView.setImage(messageImageBlack);
        Image gearImageBlack = new Image(getClass().getResourceAsStream("icons/gear-black.png"));
        settingsImageView.setImage(gearImageBlack);
        Image groupImageWhite = new Image(getClass().getResourceAsStream("icons/groups.png"));
        groupImageView.setImage(groupImageWhite);
    }

    @FXML
    void settingsBtn(MouseEvent event) {
        Image userImageBlack = new Image(getClass().getResourceAsStream("icons/user-black.png"));
        userImageView.setImage(userImageBlack);
        Image messageImageBlack = new Image(getClass().getResourceAsStream("icons/messages-black.png"));
        messageImageView.setImage(messageImageBlack);
        Image gearImageWhite = new Image(getClass().getResourceAsStream("icons/gear.png"));
        settingsImageView.setImage(gearImageWhite);
        Image groupImageBlack = new Image(getClass().getResourceAsStream("icons/groups-black.png"));
        groupImageView.setImage(groupImageBlack);
    }

    @FXML
    void logOutBtn(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("You sure you want to log out?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) borderPane.getScene().getWindow();
            stage.close();
        }
    }
}
