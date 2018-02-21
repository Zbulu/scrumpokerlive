import {Injectable} from "@angular/core";
import {HttpClient, HttpParams} from "@angular/common/http";
import {Person} from "../model/person";

@Injectable()
export class MeetingService {
  private url: string = "http://localhost:8080/api/meet";

  constructor(private http: HttpClient) {
  }

  startMeeting(meetingName: string, personName: string) {
    this.http.post<Person>(this.url, new StartMeetingRequest(meetingName, personName))
      .subscribe(
        (response: Person) => console.log("name: " + response.name + ", id: " + response.id)
      );
  }

  joinMeeting(meetingName: string, personName: string) {
    let httpParams = new HttpParams()
      .append("meetingName", meetingName)
      .append("personName", personName);

    this.http.get<Person>(this.url, {params: httpParams})
      .subscribe(
        (response: Person) => console.log("get: " + response.name + ", id: " + response.id)
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
