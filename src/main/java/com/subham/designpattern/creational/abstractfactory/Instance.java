package com.subham.designpattern.creational.abstractfactory;

/**
 * @author subham.paul
 *
 * Represents an abstract product
 */
public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
