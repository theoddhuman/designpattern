package com.subham.designpattern.behavioral.observer;

/**
 * @author subham.paul
 *
 * concrete observer
 */
public class QuantityObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        int count = order.getCount();
        if(count <= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (count - 5) * 1.5);
        }
    }
}
