package dev.dark;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class MainContr {

    @FXML
    private Label title;

    @FXML
    private Button coll;

    @FXML
    private Button close;

    @FXML
    private Button size;

    @FXML
    private AnchorPane icon;

    @FXML
    public StackPane current_scane;

    @FXML
    private void initialize() {

    }
    
    public void setTitle(String title) {
        this.title.setText(title);
    }

    @FXML
    private void close() {
        System.exit(0);
    }

    @FXML
    private void coll() {

    }

    @FXML
    private void size() {

    }
}
