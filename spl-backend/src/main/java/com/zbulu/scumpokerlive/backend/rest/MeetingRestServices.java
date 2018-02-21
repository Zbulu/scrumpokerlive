package com.zbulu.scumpokerlive.backend.rest;

import com.zbulu.scumpokerlive.backend.model.Person;
import com.zbulu.scumpokerlive.backend.services.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/")
@CrossOrigin(origins = "http://localhost:4200")
public class MeetingRestServices {

    private MeetingService meetingService;

    @Autowired
    public MeetingRestServices(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @RequestMapping(value = "meet", method = RequestMethod.GET)
    public Person joinMeeting(@RequestParam(name = "meetingName") String meetingName, @RequestParam(name = "personName") String personName) {
        return this.meetingService.joinMeeting(meetingName, personName);
    }

    @RequestMapping(value = "meet", method = RequestMethod.POST)
    public Person startMeeting(@RequestBody  StartMeetingRequest startMeetingRequest) {
        return this.meetingService.initializeMeeting(startMeetingRequest.meetingName).joinMeeting(startMeetingRequest.personName);
    }

}
