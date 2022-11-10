module com.example.sportpals {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sportpals to javafx.fxml;
    exports com.example.sportpals;
}