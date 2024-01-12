package com.subham.designpattern.behavioral.state;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        order.dispatched();
        order.delivered();


        System.out.println(order.cancel());
    }
}
