package com.subham.designpattern.structural.facade.email;

/**
 * @author subham.paul
 */
public class OrderEmailTemplate extends Template {
    @Override
    public String format(Object obj) {
        return "TEMPLATE";
    }
}
