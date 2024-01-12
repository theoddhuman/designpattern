package com.subham.designpattern.behavioral.state;

/**
 * @author subham.paul
 *
 * Concrete state
 */
public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("It's a new Order. No processing done");
        return 0;
    }
}
