package com.subham.designpattern.factorymethod;

import com.subham.designpattern.factorymethod.message.Message;

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
