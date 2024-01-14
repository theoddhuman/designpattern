package com.subham.designpattern.behavioral.nullobject;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        ComplexService complexService = new ComplexService("A new service", new NullStorageService());
        complexService.generateReport();
    }
}
