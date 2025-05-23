module dev.dark {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.dark to javafx.fxml;
    exports dev.dark;
}
