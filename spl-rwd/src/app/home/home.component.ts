import { Component } from "@angular/core";
import { MeetingRestService } from "../service/meeting.restService";

@Component({
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.scss"]
})
export class HomeComponent {
  constructor(private meetingRestService: MeetingRestService) {
  }

  personName: string;
  meetingName: string;

  title = "Scrum Poker Live";

  startMeeting(): void {
    console.log("starting meeting: " + this.meetingName + "as " + this.personName);
    this.meetingRestService.startMeeting(this.meetingName, this.personName);
  }

  joinMeeting(): void {
    console.log("joining meeting: " + this.meetingName + "as " + this.personName);
    this.meetingRestService.joinMeeting(this.meetingName, this.personName);
  }

}
