package com.subham.designpattern.creational.factorymethod;

import com.subham.designpattern.creational.factorymethod.message.Message;

/**
 * @author subham.paul
 *
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    //Factory method
    protected abstract Message createMessage();
}
