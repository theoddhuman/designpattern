package com.subham.designpattern.factorymethod;

import com.subham.designpattern.factorymethod.message.Message;

/**
 * @author subham.paul
 *
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory method
    protected abstract Message createMessage();
}
