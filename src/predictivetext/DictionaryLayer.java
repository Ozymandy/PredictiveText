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
public class DictionaryLayer {
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
                temp = entry.getValue() + " "+ entry.getKey();
                writer.write(temp);
                writer.newLine();
            }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
}
