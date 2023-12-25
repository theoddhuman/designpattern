package com.subham.designpattern.structural.facade.email;

/**
 * @author subham.paul
 */
public class Email {
    public static EmailBuilder getBuilder() {
        return new EmailBuilder();
    }
}
