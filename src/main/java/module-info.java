module com.example.testcrud {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.testcrud to javafx.fxml;
    exports com.example.testcrud;
}
