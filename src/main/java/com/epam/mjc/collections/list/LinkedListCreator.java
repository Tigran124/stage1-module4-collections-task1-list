package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer x : sourceList){
            if ((x % 2) == 0){
                list.addLast(x);
            }else {
                list.addFirst(x);
            }
        }
        return list;
    }
}
