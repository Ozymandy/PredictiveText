/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.beans.value.*;
import java.util.*;

/**
 * FXML Controller class
 *
 * @author Ozymandy
 */
public class FormController implements Initializable {

    @FXML
    private ListView<WordModel> listwords;
    @FXML
    private TextField keyword;
    @FXML
    private TextArea outputTextArea;
    @FXML
    public VBox vboxlayout;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Trie trie = new Trie();
        Service service = new Service(new TxtReader("E:\\War.txt"));
        service.writeToTrie(trie);
        keyword.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.isEmpty()) {
                vboxlayout.getChildren().clear();
                List<WordModel> list = trie.getWords(newValue);
                if (list == null) {
                    vboxlayout.getChildren().add(new Label("Не найдено"));
                } else {
                    for (int i = 0; i < 10; i++) {
                        if (i < list.size()) {
                            vboxlayout.getChildren().add(new Label(list.get(i).getWord() + " " + list.get(i).getPriority()));
                        }
                    }
                }
            }
        });
    }
}
