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
    private Node root;
    public Trie(){
    root = new Node() {{ isLeaf = false;}};
    }
    public void put(String word,int priority){
        Node temp = root;
        char[] array = word.toLowerCase().toCharArray(); //word by every char
        String teststring = ""; //for testing
        for(int i =0;i<array.length;i++){
            if(temp.children.containsKey(array[i])){
                temp = temp.children.get(array[i]);
            }
            else {
                temp.children.put(array[i], new Node());
                temp = temp.children.get(array[i]);
            }
            teststring = teststring.concat(Character.toString(array[i]));
        }
        temp.isLeaf = true;
        temp.Priority=priority;
    }
    public List<String> getWords(String keyword){
        String tempword = keyword;
        Node temp = this.moveTo(keyword);
        List<String> list = new ArrayList<String>();
        for(Map.Entry<Character,Node> entry:temp.children.entrySet()){
            if(entry.getValue().isLeaf){
                list.add(keyword);
            }
            else{
                list.addAll(this.getWords(tempword.concat(entry.getKey().toString())));
            }
        }
        return list;
    }
    public boolean find(String word){
        Node temp = this.moveTo(word);
        boolean isExists=false;
        if(temp.isLeaf)
        {
            isExists = true;
        }
        return isExists;
    }
    public void delete(String word){
        this.moveTo(word).isLeaf = false;
    }
    private Node moveTo(String keyword){
        if(keyword!=null){
        Node temp = root;
        char[] array = keyword.toLowerCase().toCharArray();
        for(int i = 0;i<array.length;i++){
        if(temp.children.containsKey(array[i])){
            temp = temp.children.get(array[i]);
        }
        else{
            break;
            //throw new NoWordException;
            }
        }
        return temp;
        }
        else {
            throw new NullPointerException();
        }
    }
    static class Node {
        Map<Character,Node> children = new TreeMap<Character,Node>();
        boolean isLeaf; //check for intermediate node
        int Priority;
    }
}
