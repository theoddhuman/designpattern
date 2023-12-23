package com.subham.designpattern.structural.decorator;

/**
 * @author subham.paul
 *
 * Decorator abstraction
 */
public interface EncodedDecorator extends Message {
    String getEncodedString(String s);
}
