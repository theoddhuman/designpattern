package com.subham.designpattern.behavioral.observer;

/**
 * @author subham.paul
 * 
 * Using observer design pattern we can notify multiple objects whenever an object changes state.
 * 
 * We are defining one-to-many dependency between objects, where many objects are listening for state
 * change of a single object, without tightly coupling all of them together.
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
