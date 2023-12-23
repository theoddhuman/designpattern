package com.subham.designpattern.structural.bridge;

/**
 * @author subham.paul
 *
 * This is the abstraction.
 */
public interface FifoCollection<T> {
    //Adds element to collection
    void offer(T element);

    //Removes & returns first element from collection
    T poll();
}
