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
public class Service {

    private Readable reader;

    public Service(Readable reader) {
        this.reader = reader;
    }

    private Map<String, Integer> calculateFrequency() {
        List<String> temp = reader.read();
        Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
        for (int i = 0; i < temp.size(); i++) {
            if (!frequencyMap.containsKey(temp.get(i))) {
                frequencyMap.put(temp.get(i), 1);
            } else {
                frequencyMap.replace(temp.get(i), frequencyMap.get(temp.get(i)) + 1);
            }
        }
        return frequencyMap;
    }
//    private List<Map.Entry<String,Integer>> sortByFrequency(){
//        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>();
//        Map<String,Integer> temp = this.calculateFrequency();
//        for(Map.Entry<String,Integer> entry:temp.entrySet()){
//            list.add(entry);
//        }
//        Collections.sort(list,new WordModelComparator());
//	return list;
//    }

    public void writeToTrie(Trie trie) {
        Map<String, Integer> list = this.calculateFrequency();
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            trie.put(entry.getKey(), entry.getValue());
        }

    }
}
