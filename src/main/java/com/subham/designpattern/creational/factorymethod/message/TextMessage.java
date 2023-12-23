package com.subham.designpattern.creational.factorymethod.message;

/**
 * @author subham.paul
 */
public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text";
    }
}
