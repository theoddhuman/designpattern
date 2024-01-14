package com.subham.designpattern.behavioral.state;

/**
 * @author subham.paul
 * 
 * This pattern allows our objects to behave differently based on its current internal state.
 * 
 * This pattern allows to define the state specific behaviors in separate classes.
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        order.dispatched();
        order.delivered();


        System.out.println(order.cancel());
    }
}
