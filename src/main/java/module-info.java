module dev.dark {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens dev.dark to javafx.fxml;
    exports dev.dark;
}
