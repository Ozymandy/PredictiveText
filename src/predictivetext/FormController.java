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

/**
 * FXML Controller class
 *
 * @author Ozymandy
 */
public class FormController implements Initializable {
    @FXML
    private ListView<WordModel> listwords;
    private TextField keyword;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       Trie trie = new Trie();
       Service service = new Service(new TxtReader("E:\\War.txt"));
       service.writeToTrie(trie);
    }    
    
}
