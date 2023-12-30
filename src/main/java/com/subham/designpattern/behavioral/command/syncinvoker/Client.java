package com.subham.designpattern.behavioral.command.syncinvoker;

/**
 * @author subham.paul
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
