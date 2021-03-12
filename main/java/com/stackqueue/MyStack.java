package com.stackqueue;

public class MyStack {

    private final LinkedList myList;

    public MyStack() {
        this.myList = new LinkedList();
    }

    public void push(INode myNode) {
        myList.add(myNode);
    }

    // create and add to the stack

    public INode peak() {
        return myList.head;
    }

    public void printStack() {
        myList.print();
    }

    public INode pop() {
        return myList.pop();
    }



    public static void main(String[] args){
        //master welcome message
        System.out.println("..Welcome to Stack and Queue program..");
    }
}
