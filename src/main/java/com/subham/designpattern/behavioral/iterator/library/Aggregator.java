package com.subham.designpattern.behavioral.iterator.library;

public interface Aggregator<T> {
    void add(T book);

    void remove(int index);

    Iterator<T> createIterator();
}
