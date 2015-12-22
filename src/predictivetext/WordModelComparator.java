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
public class WordModelComparator implements Comparator {

    public WordModelComparator() {
    }

    @Override
    public int compare(Object a, Object b) {
        return ((Integer) ((WordModel) b).getPriority()).compareTo(((Integer) ((WordModel) a).getPriority()));
    }

}
