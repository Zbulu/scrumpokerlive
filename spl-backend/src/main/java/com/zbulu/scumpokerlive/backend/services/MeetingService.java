package com.zbulu.scumpokerlive.backend.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zbulu.scumpokerlive.backend.model.Meeting;

@Service
public class MeetingService {

    public Meeting initiateMeeting(String meetingName) {
        //todo meeting initialization
        return new Meeting(meetingName);
    }


}
