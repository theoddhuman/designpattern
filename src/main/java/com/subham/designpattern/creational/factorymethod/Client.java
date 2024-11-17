package com.subham.designpattern.creational.factorymethod;

import com.subham.designpattern.creational.factorymethod.message.Message;

/**
 * @author subham.paul
 * 
 * Move the object creation logic from our code to a separate class.
 * 
 * This pattern is used when we don't know in advance which class we may need to instantiate
 * beforehand and also to allow new classed to be added to system and handle their creation without 
 * affecting client code.
 * 
 */
public class Client {

    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.createMessage();
        System.out.println(msg.getContent());
    }
}
