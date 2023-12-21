package com.subham.designpattern.singleton;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        SingletonIH singletonIH = SingletonIH.getInstance();
        SingletonIH.getInstance();
        SingletonIH.getInstance();
    }
}
