package com.example.sportpals;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.image.Image;

import java.io.IOException;
import java.net.ServerSocket;

public class sportPals extends Application {
    /**
     * <p>
     *     The method that will run at the start of the program
     *     from the main method and it will create the main stage,
     *     app name, set the app icon and load the fxml
     *     with the data for the GUI.
     * </p>
     * */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(sportPals.class.getResource("sport-pals.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 560);
        stage.setTitle("Sport Pals");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume();
            logOutBtn(stage);
        });

    }

    public void logOutBtn(Stage stage){

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("You sure you want to log out?");

        if (alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out");
            stage.close();
        }
    }


    /**
     * The main.
     *
     * @param args
     * */
    public static void main(String[] args) {

        launch();

    }
}