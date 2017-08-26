package com.zbulu.scumpokerlive.backend.model;

import java.util.List;
import java.util.Set;

public class Meeting {

    private String name;
    private Set<Story> stories;
    private Set<Person> attendees;

    public Meeting(String pName) {
        name = pName;
    }
}
