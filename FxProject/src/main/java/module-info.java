module com.mycompany.fxproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.fxproject to javafx.fxml;
    exports com.mycompany.fxproject;
}