import { Component } from "@angular/core";
import { MeetingService } from "./service/meeting.service";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.scss"]
})
export class AppComponent {
  constructor(private meetingService: MeetingService) {
  }

  personName: string;
  meetingName: string;

  title = "Scrum Poker Live";

  startMeeting(): void {
    console.log("starting meeting: " + this.meetingName + "as " + this.personName);
    this.meetingService.startMeeting(this.meetingName, this.personName);
  }

  joinMeeting(): void {
    console.log("joining meeting: " + this.meetingName + "as " + this.personName);
    this.meetingService.joinMeeting(this.meetingName, this.personName);
  }

}
