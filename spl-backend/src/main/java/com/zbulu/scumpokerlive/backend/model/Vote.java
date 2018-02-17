package com.zbulu.scumpokerlive.backend.model;

public class Vote {
    private int value;
    private String name;
    private Meeting Meeting;

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

}
