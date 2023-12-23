package com.subham.designpattern.structural.decorator;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        Message message = new TextMessage("This is super message");
        System.out.println(message.getContent());

        EncodedDecorator decorator = new Base64EncodedDecorator(message);
        System.out.println(decorator.getContent());
    }
}
