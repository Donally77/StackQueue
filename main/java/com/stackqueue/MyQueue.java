package com.stackqueue;

public class MyQueue {

    private final LinkedList myList;

    public MyQueue() {
        myList = new LinkedList();
    }

    public void enQueue(INode newNode) {
        myList.append(newNode);
    }

    public int size() {
        return myList.size();
    }

    public boolean isEmpty() {
        if (myList.size() == 0)
            return true;
        else
            return false;
    }

    public void printQueue() {
        myList.print();
    }
    public INode deQueue() {
        return myList.pop();
    }

}
