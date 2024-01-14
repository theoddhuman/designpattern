package com.subham.designpattern.behavioral.mediator;

/**
 * @author subham.paul
 * 
 * Mediator encapsulates how a set of objects interact with each other. Due to this encapsulation there 
 * is a loose coupling between the interacting objects.
 * 
 * Typically an object explicitly knows about other object to which it wants to interact with.
 * In mediator pattern this interaction is within the mediator object and interacting objects
 * only know about the mediator object.
 */
public class Client {
    public static void main(String[] args) {
        MeetingRoom meetingRoom = new MeetingRoom();
        Colleague subham = new ColleagueImpl(meetingRoom, "Subham");
        Colleague tarun = new ColleagueImpl(meetingRoom, "Tarun");
        Colleague srajan = new ColleagueImpl(meetingRoom, "Srajan");
        subham.speak("Hi!");
        tarun.speak("How are you?");
    }
}
