/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;

/**
 *
 * @author Ozymandy
 */
public class PredictiveText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Trie trie = new Trie();
       trie.put("Apple");
       trie.put("Tree");
       System.out.println(trie.find("Tree"));
       System.out.println(trie.find("Honey"));
    }
    
}
