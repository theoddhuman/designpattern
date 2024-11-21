package com.subham.designpattern.behavioral.iterator.library;

import java.util.ArrayList;
import java.util.List;

public class Library<T> implements Aggregator<T> {
    private List<T> books;

    public Library() {
        books = new ArrayList<>();
    }

    @Override
    public void add(T book) {
        books.add(book);
    }

    @Override
    public void remove(int index) {
        books.remove(index);
    }

    @Override
    public Iterator<T> createIterator() {
        return new BookIterator();
    }

    public class BookIterator implements Iterator<T> {
        private int position;

        BookIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public T next() {
            if(!hasNext()) {
                return null;
            }
            return books.get(position++);
        }
    }
}
