package com.mpillz;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyStack {
//remove and add form the front

    private LinkedList<String> list = new LinkedList<>();

    public void push (String item) {
        list.addFirst(item);
    }

    public String pop() {
        return list.removeFirst();
    }

    public void print() {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
