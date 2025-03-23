package ch.zhaw.it.prog2.wordcloud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Label lableTitle;

    @FXML
    private TextField textEntry;

    @FXML
    private TextArea textHistory;

    public void initialize() {
        lableTitle.textProperty().bind(textEntry.textProperty());
    }

    @FXML
    void addText(ActionEvent event) {
        textHistory.appendText(textEntry.getText() + "\n");
    }

    @FXML
    void clearTextEntry(ActionEvent event) {
        textEntry.clear();
    }

}
