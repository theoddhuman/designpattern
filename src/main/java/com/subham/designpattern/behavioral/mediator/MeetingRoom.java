package com.subham.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author subham.paul
 *
 * Concrete mediator class
 */
public class MeetingRoom {
    private List<Colleague> colleagues = new ArrayList<>();

    public void enter(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    public void transferSpeech(Colleague colleague) {
        this.colleagues.stream().filter(c -> c!=colleague).forEach(c -> c.listen(colleague));
    }
}
