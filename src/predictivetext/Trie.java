/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;
import java.util.*;
/**
 *
 * @author Ozymandy
 */
public class Trie {
    Node root;
    public Trie(){
    root = new Node() {{ isLeaf = false;}};
    }
    public void put(String word){
        Node temp = root;
        char[] array = word.toLowerCase().toCharArray(); //word by every char
        for(int i =0;i<array.length;i++){
            if(temp.children.containsKey(array[i])){
                temp = temp.children.get(array[i]);
            }
            else {
                temp.children.put(array[i], new Node());
                temp = temp.children.get(array[i]);
            }
        }
        temp.isLeaf = true;
    }
    public boolean find(String word){
        Node temp = root;
        boolean isExists=false;
        char[] array = word.toLowerCase().toCharArray(); //word by every char
        for(int i = 0;i<array.length;i++){
            if(temp.children.containsKey(array[i])){
                temp = temp.children.get(array[i]);
            }
            else{
                break;
            }
        }
        if(temp.isLeaf)
        {
            isExists = true;
        }
        return isExists;
    }
    public void delete(String word){
        Node temp = root;
        char[] array = word.toLowerCase().toCharArray();
        for(int i = 0; i<array.length;i++) {
            if(temp.children.containsKey(array[i])){
                temp = temp.children.get(array[i]);
            }
            else{
                break;
                //NowWordException
            }
        }
        temp.isLeaf = false;
    }
    private Node moveTo(String keyword){
        return null;
    }
    static class Node {
        Map<Character,Node> children = new TreeMap<Character,Node>();
        boolean isLeaf; //check for intermediate node
        int Priority;
    }
}
