package com.zbulu.scumpokerlive.backend.rest;

import java.io.Serializable;

public class StartMeetingResponse implements Serializable {
    private static final long serialVersionUID = 1481347082343812541L;

    public StartMeetingResponse(String meetingName, String personName, String personId) {
        this.meetingName = meetingName;
        this.personName = personName;
        this.personId = personId;
    }

    public String meetingName;
    public String personName;
    public String personId;
}
