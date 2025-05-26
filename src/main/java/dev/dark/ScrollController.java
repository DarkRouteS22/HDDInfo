package dev.dark;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ScrollController {
    @FXML
    public VBox container;

     public void addHddElement(String name, double progress) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hddEl.fxml"));
            HBox hddElement = loader.load();
            Hdd hdd = loader.getController();
            
            Label nameLabel = hdd.nameLabel;
            ProgressBar progressBar = hdd.progressBar;
            
            progressBar.setProgress(progress);
            nameLabel.setText(name);
            
            container.getChildren().add(hddElement);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
