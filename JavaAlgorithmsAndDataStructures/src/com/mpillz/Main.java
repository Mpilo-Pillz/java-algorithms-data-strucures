package com.mpillz;
import com.mpillz.MyQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("Thulani");
        myQueue.enqueue("Fikasentani");
        myQueue.enqueue("Nikita");
        myQueue.print();
        System.out.println(myQueue.size());
        myQueue.dequeue();
        myQueue.print();
        System.out.println(myQueue.size());

        System.out.println("----------------------------");
        MyStack myStack = new MyStack();
        myStack.push("Dlamini");
        myStack.push("Mpilo");
        myStack.push("Karabo");
        myStack.push("Pillz");
        myStack.print();

        System.out.println("-------------------------");
        myStack.pop();
        myStack.print();



    }
}
