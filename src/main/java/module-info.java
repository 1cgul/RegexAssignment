module com.example.regexassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.regexassignment to javafx.fxml;
    exports com.example.regexassignment;
}