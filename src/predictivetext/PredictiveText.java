/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author Ozymandy
 */
public class PredictiveText extends Application {

    /**
     * @param args the command line arguments
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Form.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//       Trie trie = new Trie();
//       Service service = new Service(new TxtReader("E:\\War.txt"));
//       service.writeToTrie(trie);
//       List<WordModel> list = trie.getWords("ыа");
//       if(list==null){ System.out.println("Не найдено"); }
//       else{
//       for(WordModel model:list){
//           System.out.println(model.getWord()+" "+model.getPriority());
//       }
//       }
// cr желательно в курсаче не иметь закомментированного кода
        launch(args);
    }
}
