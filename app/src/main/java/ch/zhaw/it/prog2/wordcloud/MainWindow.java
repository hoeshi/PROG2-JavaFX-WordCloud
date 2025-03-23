package ch.zhaw.it.prog2.wordcloud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) {
        openMainWindow(primaryStage);
    }

    private void openMainWindow(Stage stage) {


        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MainWindow.fxml"));
            Pane rootNode = loader.load(); //Lade FXML-Datei und erzeuge Szenengraph

            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.setMinHeight(200);
            stage.setMinWidth(300);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}