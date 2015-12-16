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
public class MapValueComparator implements Comparator {
    public MapValueComparator() {
    }
    @Override
    public int compare(Object a, Object b) {
        Map.Entry<String,Integer> entryA = (Map.Entry<String,Integer>)a;
        Map.Entry<String,Integer> entryB = (Map.Entry<String,Integer>)b;
        return (entryB.getValue()).compareTo(entryA.getValue());
    }

}
