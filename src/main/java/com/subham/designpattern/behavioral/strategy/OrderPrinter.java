package com.subham.designpattern.behavioral.strategy;

import java.util.Collection;

/**
 * @author subham.paul
 *
 * Strategy
 */
public interface OrderPrinter {
    void print(Collection<Order> orders);
}
