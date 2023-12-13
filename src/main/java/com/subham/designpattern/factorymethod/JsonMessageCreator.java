package com.subham.designpattern.factorymethod;

import com.subham.designpattern.factorymethod.message.JsonMessage;
import com.subham.designpattern.factorymethod.message.Message;

/**
 * @author subham.paul
 */
public class JsonMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new JsonMessage();
    }
}
