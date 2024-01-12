package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int aVal = 5 * (x * x) + 3;
        int bVal = 5 * (y * y) + 3;
        if (aVal == bVal){
            if (x > y){
                return 1;
            }else {
                return -1;
            }
        } else if (aVal > bVal) {
            return 1;
        }else return -1;
    }
}
