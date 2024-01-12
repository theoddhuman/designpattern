package com.subham.designpattern.behavioral.state;

/**
 * @author subham.paul
 *
 * Concrete State
 */
public class InTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting payment gateway for transaction roll back");
        return 20;
    }
}
