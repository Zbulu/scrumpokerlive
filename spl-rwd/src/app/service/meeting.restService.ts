import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";
import * as _ from "lodash";

import { Person } from "../model/person";
import { MeetingService } from "./meetingService";

@Injectable()
export class MeetingRestService {
  private url = "http://localhost:8080/api/meet";

  constructor(private http: HttpClient, private meetingService: MeetingService) {
  }

  startMeeting(meetingName: string, personName: string): void {
    if (!_.isEmpty(this.meetingService.getMeetingName())) {
      console.error("Already in meeting, please leave before starting another");
      return;
    }
    this.http.post<Person>(this.url, new StartMeetingRequest(meetingName, personName))
        .subscribe(
            (response: Person) => {
              console.log("name: " + response.name + ", id: " + response.id);
              this.meetingService.setMeetingName(meetingName);
              this.meetingService.setPerson(response);
            }
        );
  }

  joinMeeting(meetingName: string, personName: string): void {
    console.log(this.meetingService.getMeetingName());
    if (!_.isEmpty(this.meetingService.getMeetingName())) {
      console.error("Already in meeting, please leave before joining another");
      return;
    }
    const httpParams = new HttpParams()
        .append("meetingName", meetingName)
        .append("personName", personName);

    this.http.get<Person>(this.url, {params: httpParams})
        .subscribe(
            (response: Person) => {
              console.log("get: " + response.name + ", id: " + response.id);
              this.meetingService.setMeetingName(meetingName);
              this.meetingService.setPerson(response);
            }
        );
  }
}

export class StartMeetingRequest {
  meetingName: string;
  personName: string;

  constructor(meetingName: string, personName: string) {
    this.meetingName = meetingName;
    this.personName = personName;
  }
}
