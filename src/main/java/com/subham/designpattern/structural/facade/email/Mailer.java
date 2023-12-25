package com.subham.designpattern.structural.facade.email;

/**
 * @author subham.paul
 */
public class Mailer {
    private static final Mailer MAILER = new Mailer();

    public static Mailer getMailer() {
        return MAILER;
    }

    private Mailer() {

    }

    public boolean send(Email email) {
        return true;
    };
}
