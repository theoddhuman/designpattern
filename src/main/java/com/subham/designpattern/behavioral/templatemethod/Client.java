package com.subham.designpattern.behavioral.templatemethod;

import java.io.IOException;

/**
 * @author subham.paul
 * 
 * Using this pattern we define an algorithm in a method as a sries of steps (method calls) and 
 * provide a chance for subclasses to define or redefine some of these steps.
 * 
 * The pattern works by defining abstract methods which then ahve to be implemented by concrete
 * subclasses. These methods are like hooks which are then called by template method.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Order order = new Order("1001");

        order.addItem("Soda", 2.50);
        order.addItem("Sandwitch", 11.95);
        order.addItem("Pizza", 15.95);

        OrderPrinter printer = new HtmlPrinter();
        printer.printOrder(order, "1001.html");

        OrderPrinter printer1 = new TextPrinter();
        printer1.printOrder(order, "1002.txt");
    }
}
