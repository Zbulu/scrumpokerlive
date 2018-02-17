package com.zbulu.scumpokerlive.backend.model;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Meeting {

    private String name;
    private Set<Story> stories = new HashSet<>();
    private Set<Person> attendees = new HashSet<>();
    private LocalTime lastActivity;

    public Meeting(String pName) {
        name = pName;
        this.lastActivity = LocalTime.now();
    }

    public void joinMeeting(String personName) {
        this.attendees.add(new Person(personName));
    }

    public void leaveMeeting(Person person) {
        this.attendees.remove(person);
    }

    public void setActivity() {
        this.lastActivity = LocalTime.now();
    }

    public String getName() {
        return name;
    }
}
