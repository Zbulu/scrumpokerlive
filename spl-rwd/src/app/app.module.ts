import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RestService } from "./service/rest.service";
import {HttpClientModule} from "@angular/common/http";
import {MeetingService} from "./service/meeting.service";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule
  ],
  providers: [RestService, MeetingService],
  bootstrap: [AppComponent]
})
export class AppModule { }
