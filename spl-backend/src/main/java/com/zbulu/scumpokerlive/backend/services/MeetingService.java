package com.zbulu.scumpokerlive.backend.services;

import com.zbulu.scumpokerlive.backend.model.Meeting;
import com.zbulu.scumpokerlive.backend.model.Person;

public interface MeetingService {

    Meeting initializeMeeting(String meetingName);

    Meeting getMeeting(String meetingName);

    void closeMeeting(String meetingName);

    Person joinMeeting(String meetingName, String personName);

    void leaveMeeting(String meetingName, Person person);
}
