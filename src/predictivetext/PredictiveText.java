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
       Trie trie = new Trie();
       Service service = new Service(new TxtReader("E:\\War.txt"));
//       Comparator compare = new MapValueComparator(temp);
//       Map<String,Integer> map = new TreeMap<String,Integer>(compare);
//       map.putAll(temp);
//       for (Map.Entry<String,Integer> entry : service.sortByFrequency()) {
//       System.out.println(entry.getValue() + " "+entry.getKey());
//    }
       service.writeToDictionary();
    }
}
