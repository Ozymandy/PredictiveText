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
       //DictionaryLayer dictionary = new DictionaryLayer("E:\\dictionary.txt");
       //trie = dictionary.writeToTrie();
       //boolean test;
       //test =trie.find("сказал");
       //System.out.println(test);
       String keyword = "bo";
       trie = new Trie();
       trie.put("Borussia",4);
       trie.put("Boring",5);
       trie.put("Bored",7);
       trie.put("Test",4);
       List<String> variants = trie.getWords(keyword);
       for(String variant:variants){
           System.out.println(variant);
       }
    }
}
