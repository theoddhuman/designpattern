package com.subham.designpattern.behavioral.strategy;

import java.util.LinkedList;

/**
 * @author subham.paul
 * <p>
 * Context
 */
public class PrinterService {
    private OrderPrinter printer;

    public PrinterService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
