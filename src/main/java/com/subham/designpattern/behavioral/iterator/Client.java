package com.subham.designpattern.behavioral.iterator;

import com.subham.designpattern.behavioral.iterator.library.Iterator;

/**
 * @author subham.paul
 * 
 * Iterator allows a way to access elements of an aggregate object in sequence while hiding the
 * actual internal data structure used.
 */
public class Client {
    public static void main(String[] args) {
        Iterator<Color> iterator = Color.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
