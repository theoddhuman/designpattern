package com.subham.designpattern.behavioral.templatemethod;

import java.io.IOException;

/**
 * @author subham.paul
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
