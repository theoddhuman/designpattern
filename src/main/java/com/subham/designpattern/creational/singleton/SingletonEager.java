package com.subham.designpattern.creational.singleton;

/**
 * @author subham.paul
 *
 * This class uses eager initialization of singleton instance.
 *
 * If singleton class is loaded by two classloaders two instance of singleton class will be created, one for each classloader.
 *
 * If singleton class is serializable, you can serialize the singleton instance. Once it serialized, you can deserialize it
 * but, it won't return the singleton object
 */

public class SingletonEager {
    private SingletonEager() {
    }

    private static final SingletonEager INSTANCE = new SingletonEager();

    public SingletonEager getInstance() {
        return INSTANCE;
    }
}
