package com.subham.designpattern.behavioral.state;

/**
 * @author subham.paul
 *
 * Concrete State
 */
public class Cancelled implements OrderState {
    @Override
    public double handleCancellation() {
        throw new IllegalArgumentException("Cancelled order. Can't cancel anymore");
    }
}
