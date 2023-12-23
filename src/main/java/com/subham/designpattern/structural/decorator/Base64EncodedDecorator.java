package com.subham.designpattern.structural.decorator;

/**
 * @author subham.paul
 *
 * Concrete Decorator
 */
public class Base64EncodedDecorator implements EncodedDecorator {
    private Message msg;

    public Base64EncodedDecorator(Message m) {
        this.msg = m;
    }

    @Override
    public String getEncodedString(String s) {
        return s + " Base64 encoded";
    }

    @Override
    public String getContent() {
        return getEncodedString(msg.getContent());
    }
}
