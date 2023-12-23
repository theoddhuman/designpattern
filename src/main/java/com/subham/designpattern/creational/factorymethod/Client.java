package com.subham.designpattern.creational.factorymethod;

import com.subham.designpattern.creational.factorymethod.message.Message;

/**
 * @author subham.paul
 */
public class Client {

    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
