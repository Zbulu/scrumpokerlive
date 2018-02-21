package com.zbulu.scumpokerlive.backend.services;

import com.google.common.collect.Maps;
import com.zbulu.scumpokerlive.backend.model.Meeting;
import com.zbulu.scumpokerlive.backend.model.Person;
import mockit.Deencapsulation;
import mockit.Tested;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class MeetingServiceImplTest {
    private static final String MEETING_NAME = "myMeeting";
    private Meeting SAMPLE_MEETING = new Meeting(MEETING_NAME);

    @Tested
    private MeetingServiceImpl underTest;

    private void setMeetings() {
        Map<String, Meeting> SAMPLE_MEETINGS = Maps.newHashMap();
        SAMPLE_MEETINGS.put(MEETING_NAME, SAMPLE_MEETING);
        Deencapsulation.setField(underTest, "activeMeetings", SAMPLE_MEETINGS);
    }

    @Test
    public void newMeetingInitialisedWithRightName() throws Exception {
        // given  + when
        Meeting testMeeting = this.underTest.initializeMeeting(MEETING_NAME);

        // then
        assertThat(testMeeting.getName()).isEqualTo(MEETING_NAME);
    }

    @Test
    public void getMeeting() throws Exception {
        // given
        this.setMeetings();

        // when
        Meeting requestedMeeting = underTest.getMeeting(MEETING_NAME);

        // then
        assertThat(requestedMeeting).isEqualTo(SAMPLE_MEETING);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void closeMeeting() throws Exception {
        // given
        this.setMeetings();

        // when
        this.underTest.closeMeeting(MEETING_NAME);

        // then
        assertThat((Map<String, Meeting>) Deencapsulation.getField(underTest, "activeMeetings"))
                .isEmpty();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void joinMeeting() throws Exception {
        // given
        this.setMeetings();

        // when
        Person attendee = this.underTest.joinMeeting(MEETING_NAME, "Tester");

        // then
        assertThat((Set<Person>) Deencapsulation.getField(SAMPLE_MEETING, "attendees")).containsExactly(attendee);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void leaveMeeting() throws Exception {
        // given
        this.setMeetings();
        Person attendee = this.underTest.joinMeeting(MEETING_NAME, "Tester");

        // when
        this.underTest.leaveMeeting(MEETING_NAME, attendee);

        // then
        assertThat((Set<Person>) Deencapsulation.getField(SAMPLE_MEETING, "attendees")).doesNotContain(attendee);

    }
}