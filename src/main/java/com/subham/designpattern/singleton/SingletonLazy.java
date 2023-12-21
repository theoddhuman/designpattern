package com.subham.designpattern.singleton;

/**
 * @author subham.paul
 *
 * This class uses lazy initialization of singleton instance
 *
 */
public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }

    public void show() {
        System.out.println("Singleton lazy loading");
    }
}
