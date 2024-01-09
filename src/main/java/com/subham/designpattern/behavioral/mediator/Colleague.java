package com.subham.designpattern.behavioral.mediator;

/**
 * @author subham.paul
 *
 * abstract colleague
 */
public interface Colleague {
    void listen(Colleague user);

    void speak(String message);

    String getName();

    String getMessage();
}
