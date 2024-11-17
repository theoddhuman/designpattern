package com.subham.designpattern.creational.factorymethod.message;

/**
 * @author subham.paul
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 */
public abstract class Message {
    public abstract String getContent();
}
