package com.subham.designpattern.behavioral.mediator;

/**
 * @author subham.paul
 *
 * concrete colleague, implementaton can vary
 */
public class ColleagueImpl implements Colleague {
    private String name;
    private MeetingRoom meetingRoom;
    private String message;

    public ColleagueImpl(MeetingRoom meetingRoom, String name) {
        this.meetingRoom = meetingRoom;
        this.name = name;
        this.meetingRoom.enter(this);
    }

    @Override
    public void listen(Colleague user) {
        System.out.print(this.name + " listening to " + user.getName() + "......");
        System.out.println(user.getMessage());
    }

    @Override
    public void speak(String message) {
        this.message = message;
        System.out.println(this.name + " speaking..." + message);
        this.meetingRoom.transferSpeech(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
