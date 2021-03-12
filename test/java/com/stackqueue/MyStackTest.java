package com.stackqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    @Test
    public void stackTestForPush() {
        System.out.println("This test is for pushing elements to the Stack.");
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        MyStack myStack = new MyStack();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        assertEquals(thirdNode, peak);
    }
}
