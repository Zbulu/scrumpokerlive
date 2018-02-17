package com.zbulu.scumpokerlive.backend.services;

import com.zbulu.scumpokerlive.backend.model.Meeting;
import mockit.Tested;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MeetingServiceImplTest {
    private static String MEETING_NAME = "myMeeting";

    @Tested
    private MeetingServiceImpl underTest;

    @Test
    public void newMeetingInitialisedWithRightName() throws Exception {
        Meeting some = underTest.initializeMeeting(MEETING_NAME);

        assertThat(some.getName()).isEqualTo(MEETING_NAME);
    }

    @Test
    public void getMeeting() throws Exception {
    }

    @Test
    public void closeMeeting() throws Exception {
    }

    @Test
    public void joinMeeting() throws Exception {
    }

    @Test
    public void leaveMeeting() throws Exception {
    }
}