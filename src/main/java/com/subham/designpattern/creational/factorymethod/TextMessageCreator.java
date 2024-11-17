package com.subham.designpattern.creational.factorymethod;

import com.subham.designpattern.creational.factorymethod.message.Message;
import com.subham.designpattern.creational.factorymethod.message.TextMessage;

/**
 * @author subham.paul
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
