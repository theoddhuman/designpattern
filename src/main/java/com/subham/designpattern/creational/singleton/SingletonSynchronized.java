package com.subham.designpattern.creational.singleton;

/**
 * @author subham.paul
 *
 * This class uses lazy initialization for singleton instance.
 * getInstance methos is thread safe,
 * Using synchronized every time while creating the singleton object is expenisve and may decrease performance of the system.
 */
public class SingletonSynchronized {
    private static SingletonSynchronized INSTANCE;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonSynchronized();
        }
        return INSTANCE;
    }

    public void show() {
        System.out.println("Singleton lazy loading synchronized");
    }
}
