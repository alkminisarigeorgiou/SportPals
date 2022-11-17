module com.example.sportpals {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.sportpals to javafx.fxml;
    exports com.example.sportpals;
}