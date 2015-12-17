/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

/**
 *
 * @author Ozymandy
 */
public class PredictiveText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Trie trie =null;
       DictionaryLayer dictionary = new DictionaryLayer("E:\\Dictionary.txt");
       trie = dictionary.writeToTrie();
    }
}
