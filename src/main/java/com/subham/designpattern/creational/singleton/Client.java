package com.subham.designpattern.creational.singleton;

/**
 * @author subham.paul
 * 
 * A singleton class has only one instance, accessible globally through a single point.
 * 
 * Only a single instance of this class exists.
 */
public class Client {
    public static void main(String[] args) {
        SingletonIH singletonIH = SingletonIH.getInstance();
        SingletonIH.getInstance();
        SingletonIH.getInstance();
    }
}
