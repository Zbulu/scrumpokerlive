package com.zbulu.scumpokerlive.backend.model;

import java.util.List;

public class Meeting {

    private String name;
    private List<Story> stories;
    private List<Person> attendees;

    public Meeting(String pName) {
        name = pName;
    }
}
