package com.mpillz;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyQueue {

    private LinkedList<String> list = new LinkedList<>();

    public void enqueue(String item) {
        list.addLast(item);
    }

    public String dequeue() {
        return list.removeFirst();
    }

    public int size() {

        return list.size();
    }

    public void print() {

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }

//        while(list.listIterator().hasNext()) {
//            System.out.println(list.listIterator().next());
//            list.listIterator().next();
//        }

    }
}
