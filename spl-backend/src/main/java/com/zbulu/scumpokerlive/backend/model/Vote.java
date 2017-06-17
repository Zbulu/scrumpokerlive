package com.zbulu.scumpokerlive.backend.model;

public class Vote {
    private int value;
    private String name;
    private String meetingCode;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getMeetingCode() {
        return meetingCode;
    }

    void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
}
