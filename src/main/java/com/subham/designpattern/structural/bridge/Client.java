package com.subham.designpattern.structural.bridge;

/**
 * @author subham.paul
 * 
 * Using this pattern we can decouple implementtions and abstractions so htey can both change without 
 * affecting eachother.
 * 
 * We achieve this feat by creating two separate inheritance hierarchies; one for implementation and
 * another for abstraction.
 */
public class Client {
    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());

        collection.offer(10);
        collection.offer(40);
        collection.offer(99);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        //
        System.out.println(collection.poll());
    }
}
