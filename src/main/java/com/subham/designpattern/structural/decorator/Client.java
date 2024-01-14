package com.subham.designpattern.structural.decorator;

/**
 * @author subham.paul
 * 
 * When we wnat to enhance behavior of our existing object dynamically as and when required then
 * we can use decorator design pattern.
 * 
 * decorator wraps an object within itself and provides same interface as the wrapped object. So the 
 * client of the original object doesn't need to change.
 */
public class Client {
    public static void main(String[] args) {
        Message message = new TextMessage("This is super message");
        System.out.println(message.getContent());

        EncodedDecorator decorator = new Base64EncodedDecorator(message);
        System.out.println(decorator.getContent());
    }
}
