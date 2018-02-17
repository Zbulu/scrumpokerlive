package com.zbulu.scumpokerlive.backend.services;

import com.zbulu.scumpokerlive.backend.model.Meeting;
import com.zbulu.scumpokerlive.backend.model.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MeetingServiceImpl implements MeetingService {
    private Map<String, Meeting> activeMeetings = new HashMap<>();

    @Override
    public Meeting initializeMeeting(String meetingName) {
        this.activeMeetings.put(meetingName, new Meeting(meetingName));
        return new Meeting(meetingName);
    }

    @Override
    public Meeting getMeeting(String meetingName) {
        return this.activeMeetings.get(meetingName);
    }

    @Override
    public void closeMeeting(String meetingName) {
        this.activeMeetings.remove(meetingName);
    }

    @Override
    public Person joinMeeting(String meetingName, String personName) {
        return this.getMeeting(meetingName).joinMeeting(personName);
    }

    @Override
    public void leaveMeeting(String meetingName, Person person) {
        this.getMeeting(meetingName).leaveMeeting(person);
    }
}
