package com.subham.designpattern.behavioral.command.syncinvoker;

/**
 * @author subham.paul
 * 
 * We want to represent a request or a method call as an object. Information about parameters
 * passed and actual operation is encapsualted in an object called command.
 * 
 * Advantage of command pattern is that, what would have been a method call is now an object which
 * can be stored for later execution or sent to other parts of the code.
 */
public class Client {
    public static void main(String[] args) {
        Document document = new Document();
        ActionListenerCommand command1 = new ActionOpen("file.txt", "read", document);
        ActionListenerCommand command2 = new ActionSave("file.txt", document);

        MenuOptions menu = new MenuOptions(command1, command2);
        menu.clickOpen();
        menu.clickSave();
    }
}
