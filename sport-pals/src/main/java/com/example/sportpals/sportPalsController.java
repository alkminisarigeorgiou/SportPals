package com.example.sportpals;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Date;

public class sportPalsController {

    Date currentDate = new Date();
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {welcomeText.setText(String.valueOf(currentDate));}


}