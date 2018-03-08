import { Injectable } from "@angular/core";
import { Person } from "../model/person";

@Injectable()
export class MeetingService {
  private person: Person;
  private meetingName: string;

  getMeetingName(): string {
    return this.meetingName;
  }

  setMeetingName(value: string) {
    this.meetingName = value;
  }

  getPerson(): Person {
    return this.person;
  }

  setPerson(person: Person) {
    this.person = person;
  }
}
