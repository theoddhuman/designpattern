package com.subham.designpattern.behavioral.iterator.library;

public class Client {
    public static void main(String[] args) {
        Aggregator<Book> library = new Library<>();
        library.add(new Book(123, "abc"));
        library.add(new Book(234, "ryfg"));
        Iterator<Book> iterator = library.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
