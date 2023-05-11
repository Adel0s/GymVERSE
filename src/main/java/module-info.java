module com.example.gymverse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gymverse to javafx.fxml;
    exports com.example.gymverse;
}