package com.subham.designpattern.singleton;

/**
 * @author subham.paul
 *
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class SingletonIH {
    private SingletonIH() {
        System.out.println("In SingletonIH");
    }

    private static class RegistryHolder {
        static SingletonIH INSTANCE = new SingletonIH();
    }

    public static SingletonIH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
