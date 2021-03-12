package com.stackqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyQueueTest {

    @Test
    public void enQueueTestforQueue() {
        MyQueue queue = new MyQueue();
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        queue.enQueue(firstNode);
        queue.enQueue(secondNode);
        queue.enQueue(thirdNode);
        queue.printQueue();
        int size = queue.size();
        assertEquals(3, size);
    }


}
