package ch.zhaw.it.prog2.wordcloud;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) {
        openMainWindow(primaryStage);
    }

    private void openMainWindow(Stage stage) {
        stage.show(); //leeres Fenster anzeigen
    }
}