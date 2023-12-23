package com.subham.designpattern.creational.singleton;

/**
 * @author subham.paul
 * <p>
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class SingletonDCL {
    private static volatile SingletonDCL INSTANCE;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDCL();
                }
            }
        }
        return INSTANCE;
    }

    public void show() {
        System.out.println("Singleton lazy loading double checking lock");
    }
}
