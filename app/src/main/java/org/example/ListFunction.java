package org.example;

import java.util.*;

public class ListFunction {
    static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        Set<T> set = new LinkedHashSet<>(list);
        ArrayList<T> result = new ArrayList<>(set);
        return result;
    }
}
