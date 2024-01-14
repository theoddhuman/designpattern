package com.subham.designpattern.behavioral.nullobject;

/**
 * @author subham.paul
 * 
 * Using null object pattern we can provide an alternate representation to indicate an absence of object.
 * 
 * Most important characteristic of a null object is that it'll basically do nothing and store nothing 
 * when an operation is called on it.
 */
public class Client {
    public static void main(String[] args) {
        ComplexService complexService = new ComplexService("A new service", new NullStorageService());
        complexService.generateReport();
    }
}
