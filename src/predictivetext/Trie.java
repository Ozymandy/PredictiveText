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
public class Trie {
    Node root = new Node();
    public void put(String word){
    }
    public boolean find(String word){
        return true;
    }
    public void delete(String word){
        
    }
    static class Node {
        boolean isLeaf; //check for intermediate node
    }
}
