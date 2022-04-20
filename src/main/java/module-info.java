module com.ce216group1.thecatalog {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ce216group1.thecatalog to javafx.fxml;
    exports com.ce216group1.thecatalog;
}