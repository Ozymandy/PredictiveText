/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
/**
 *
 * @author Ozymandy
 */
public class DictionaryLayer { // cr не совсем понятно по имени класс что он делает
    // cr похоже, что ничего не делает, т.к. нигде не используется
    private String DICTIONARY_PATH;
    public DictionaryLayer(String path){
        this.DICTIONARY_PATH = path;
    }
    public void setDictionaryPath(String path){
       this.DICTIONARY_PATH = path;
    }
    public void writeToDictionary(List<Map.Entry<String,Integer>> list){
        Path path = Paths.get(DICTIONARY_PATH);
        //path.concat("dictionary.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path,StandardCharsets.UTF_8,StandardOpenOption.APPEND))
        {
            String temp;
            for(Map.Entry<String,Integer> entry:list){
                if(!this.Exists(entry.getKey())){
                temp = entry.getValue() + " "+ entry.getKey();
                writer.write(temp);
                writer.newLine();
                }
                else{
                    // cr почему здесь пусто?
                }
            }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
    private boolean Exists(String word){
        boolean Exists = false;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(DICTIONARY_PATH), "UTF8"))){
            String[] temparray;
            String temp;

            while((temp=reader.readLine())!=null){
                temparray = temp.split(" ");
                if(word.equals(temparray[1])){
                    Exists=true;
                    break;
                }
            }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
        return Exists;
    }
    public Trie writeToTrie(){
        Trie trie = new Trie();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(DICTIONARY_PATH), "UTF8"))){
            String[] temparray;
            String temp;
            String intstring=null;
            while((temp=reader.readLine())!=null){
            temparray = temp.split(" ");
            if(intstring==null){ intstring = temparray[0].substring(1); } //check for first line because of System.Empty
            else { intstring = temparray[0]; } //if not first line there is no empty space
            trie.put(temparray[1], Integer.parseInt(intstring));
            }
        }
        catch(IOException ex){    
            System.out.println(ex.getMessage());
        } 
        return trie;
    }
}
