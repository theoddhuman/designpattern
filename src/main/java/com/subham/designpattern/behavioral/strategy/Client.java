package com.subham.designpattern.behavioral.strategy;

import java.util.LinkedList;

/**
 * @author subham.paul
 * 
 * Strategy pattern allows us to encapsulate an algorithm in a class. So now we can configure our
 * context or main object with an object of this class, to change the algorithm used to perform 
 * given operation.
 */
public class Client {
    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();
        PrinterService printerService = new PrinterService(new DetailPrinter());
        printerService.printOrders(orders);
    }

    private static void createOrders() {
        Order o = new Order("100");
        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}
