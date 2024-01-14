package com.subham.designpattern.structural.facade;

import com.subham.designpattern.structural.facade.email.EmailFacade;

/**
 * @author subham.paul
 * 
 * Client has to interact with large no of interfaces and classes in a subsystem to get the result.
 * So client gets tightly coupled with those interfaces and classes. Facade provides a simple and 
 * unified interface to a subsystem. Client interacts with just the facade to get same result.
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order("101", 99.99);
        EmailFacade facade = new EmailFacade();

        boolean result = facade.sendOrderEmail(order);

        System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));

    }

//    private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}
}
