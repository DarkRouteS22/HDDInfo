package dev.dark;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.CacheHint;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Random;

public class App extends Application {

    private static Scene scene;
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = loadFXML("main");
        Parent root = loader.load();
        MainContr controller = loader.getController();
        root.setCache(true);
        root.setCacheHint(CacheHint.SPEED);

        scene = new Scene(root, 600, 400);
        this.stage = stage;
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("HDDInfo");
        stage.setResizable(false);

        FXMLLoader scrlLoader = loadFXML("mainScroll");
        Parent scrollContent = scrlLoader.load();
        ScrollController scrlC = scrlLoader.getController();

        StackPane pane = new StackPane();
        pane.getChildren().add(scrollContent);

        scrlC.addHddElement("SSD Kingston", 0.7);
        scrlC.addHddElement("HDD Seagate", 0.3);
        scrlC.addHddElement("NVMe Samsung", 0.9);

        for (int i = 0; i < 10; i++) {
            scrlC.addHddElement("new disc", new Random().nextFloat());
        }

        controller.current_scane.getChildren().add(pane);

        controller.setTitle(this.stage.getTitle());
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        
        stage.show();
    }

    private static FXMLLoader loadFXML(String fxml) throws IOException {
        return new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    }

    public static void main(String[] args) {
        launch(args);
    }

}