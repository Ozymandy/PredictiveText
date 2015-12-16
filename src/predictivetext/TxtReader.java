/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;
import java.util.*;
import java.io.*;
/**
 *
 * @author Ozymandy
 */
public class TxtReader implements Readable{
    private String readPath;
    public TxtReader(String readPath){   
        this.readPath = readPath;
    }
    @Override
    public List<String> read() {
            ArrayList<String> words = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(readPath), "Cp1251"))){
                String[] temparray;
                String temp;
                while((temp=reader.readLine())!=null){
                temparray = temp.replaceAll("\\p{Punct}", "").split("\\s+");
                for(String str:temparray){
                    words.add(str.toLowerCase());
                }  
                }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
        return words;
    }
    
}
