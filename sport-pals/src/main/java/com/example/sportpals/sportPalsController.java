package com.example.sportpals;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javafx.scene.paint.Color;

import java.awt.*;
import java.io.IOException;
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
    private ComboBox<String> registerCityComboBox;

    @FXML
    private ComboBox<String> registerSportsComboBox;

    @FXML
    private TextField registerEmail;

    @FXML
    private TextField registerName;

    @FXML
    private PasswordField registerPassword;

    @FXML
    private PasswordField registerCinfirm;

    @FXML
    private TextField registerSurname;

    @FXML
    private TextField registerUsername;

    @FXML
    private Label notificationLabel;

    @FXML
    private PasswordField logInPassword;

    @FXML
    private TextField logInUsername;

    @FXML
    private Label wrongMessagelbl;

    /**
     *    When we press logInbtn
     * 1. Does user authentication and if correct
     * 2. We are taken to the chat screen (ChatRoom.fxml)
     * 3. Else it displays an error message
     */
    @FXML
    void logInbtn(ActionEvent event) {

        String username = logInUsername.getText();
        String password = logInPassword.getText();
        UserDAO userDAO = new UserDAO();
        try {
            userDAO.authenticate(username, password);
            User user = userDAO.authenticate(username, password);
            try {
                Stage stage = (Stage) registerName.getScene().getWindow();
                Parent root = FXMLLoader.load(this.getClass().getResource("ChatRoom.fxml"));
                stage.setScene(new Scene(root, 560, 600));
                stage.setTitle("Welcome " + user.getUsername());
                stage.setResizable(false);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e){
            wrongMessagelbl.setText(e.getMessage());
        }
    } // end logInbtn

    /**
     * Here we make disable sign in pane
     * and make visible sign up pane
     */
    @FXML
    void createAccount(MouseEvent event) {
        pnSignIn.setVisible(!logInVisible);
        pnSignIn.setDisable(logInVisible);
        pnSignUp.setVisible(logInVisible);
        pnSignUp.setDisable(!logInVisible);
    }

    /**
     * Here we make disable sign up pane
     * and make visible sign in pane
     */
    @FXML
    void signInPane(MouseEvent event) {
        pnSignIn.setVisible(logInVisible);
        pnSignIn.setDisable(!logInVisible);
        pnSignUp.setVisible(!logInVisible);
        pnSignUp.setDisable(logInVisible);
    }

    /**
     * Set strings to ComboBox
     * Override method is used to filled the comboBox items.
     */
    private String[] city = {"Athens", "Thesalloniki", "Patra"};
    private String[] sports = {"Football", "Basketball", "Tennis"};
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        registerCityComboBox.getItems().addAll(city);
        registerSportsComboBox.getItems().addAll(sports);
    } //end ComboBox

    /**
     * This button is used to check
     * if the text fields are filled in correctly
     */
    @FXML
    void signUpbtn(ActionEvent event) throws Exception {
        if (registerName.getLength() < 3) {
            notificationLabel.setTextFill(Color.RED);
            notificationLabel.setText("Name must be at least 3 characters long");
        } else if (registerSurname.getLength() < 3) {
            notificationLabel.setTextFill(Color.RED);
            notificationLabel.setText("Surname must be at least 3 characters long");
        } else if (registerUsername.getLength() < 3) {
            notificationLabel.setTextFill(Color.RED);
            notificationLabel.setText("Username must be at least 3 characters long");
        } else if (registerEmail.getLength() < 5) {
            notificationLabel.setTextFill(Color.RED);
            notificationLabel.setText("Email must be at least 5 characters long");
        } else if (!(registerCinfirm.getText().equals(registerPassword.getText())) || (registerPassword.getText().isEmpty()) || registerCinfirm.getText().isEmpty()) {
            notificationLabel.setTextFill(Color.RED);
            notificationLabel.setText("Password and Confirmation must be the same");
        } else if (registerCityComboBox.getSelectionModel().getSelectedIndex() == -1) {
            notificationLabel.setTextFill(Color.RED);
            notificationLabel.setText("You must select a city");
        } else if (registerSportsComboBox.getSelectionModel().getSelectedIndex() == -1) {
            notificationLabel.setTextFill(Color.RED);
            notificationLabel.setText("You must select a sport");
        } else {
            register(); //call register method
            clear(); //call clear method
            notificationLabel.setTextFill(Color.GREEN);
            notificationLabel.setText("Registration almost done!");
        }
    } //end signUpbtn button

    /**
     * This method is used to register/create new user.
     */
    public void register() throws Exception {
        UserDAO userdao = new UserDAO();
        User user = new User(registerName.getText(), registerSurname.getText(), registerUsername.getText(), registerEmail.getText(), registerCityComboBox.getValue(), registerSportsComboBox.getValue(), registerPassword.getText());
        userdao.register(user);
    } // end of register

    /**
    * This method is used to clear text field after registration.
     */
    public void clear() throws Exception {
        String cityComboBox = "City";
        registerName.clear();
        registerSurname.clear();
        registerUsername.clear();
        registerEmail.clear();
        registerCityComboBox.setValue(null);
        registerSportsComboBox.setValue(null);
        registerPassword.clear();
        registerCinfirm.clear();
        System.out.println(registerCityComboBox.getValue());
    } // end of clear text fields

} //end class
