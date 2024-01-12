package com.subham.designpattern.behavioral.observer;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order("101");
        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);

        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(quantityObserver);

        order.addItem(50);
        order.addItem(179);
        order.addItem(450);

        System.out.println(order);
    }
}
