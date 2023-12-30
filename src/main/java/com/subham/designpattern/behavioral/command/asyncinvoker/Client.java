package com.subham.designpattern.behavioral.command.asyncinvoker;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        EWSService ewsService = new EWSService();
        AddMemberCommand command1 = new AddMemberCommand("asdg@gmail.com", "spam", ewsService);
        MailTaskRunner.getInstance().addCommand(command1);
        RemoveMemberCommand command2 = new RemoveMemberCommand("subham@gmail.com", "spam", ewsService);
        MailTaskRunner.getInstance().addCommand(command2);
        Thread.sleep(3000);
        MailTaskRunner.getInstance().shutdown();
    }
}
