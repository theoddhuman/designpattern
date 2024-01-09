package com.subham.designpattern.behavioral.mediator;

/**
 * @author subham.paul
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
