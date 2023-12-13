package com.subham.designpattern.factorymethod;

import com.subham.designpattern.factorymethod.message.Message;
import com.subham.designpattern.factorymethod.message.TextMessage;

/**
 * @author subham.paul
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
