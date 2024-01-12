package com.subham.designpattern.behavioral.state;

/**
 * @author subham.paul
 *
 * Concrete State
 */
public class Paid implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction");
        return 10;
    }
}
