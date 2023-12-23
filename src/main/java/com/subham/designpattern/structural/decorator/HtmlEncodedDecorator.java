package com.subham.designpattern.structural.decorator;

/**
 * @author subham.paul
 *
 * Concrete Decorator
 */
public class HtmlEncodedDecorator implements EncodedDecorator {
    private Message msg;

    public HtmlEncodedDecorator(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return getEncodedString(msg.getContent());
    }

    @Override
    public String getEncodedString(String s) {
        return s + " Html Encoded";
    }
}
