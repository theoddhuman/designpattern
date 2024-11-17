package com.subham.designpattern.creational.factorymethod;

import com.subham.designpattern.creational.factorymethod.message.JsonMessage;
import com.subham.designpattern.creational.factorymethod.message.Message;

/**
 * @author subham.paul
 */
public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
