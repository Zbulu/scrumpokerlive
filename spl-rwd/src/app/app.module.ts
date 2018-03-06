import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";

import { AppComponent } from "./app.component";
import { MeetingService } from "./service/meeting.service";
import { RestService } from "./service/rest.service";

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
export class AppModule {
}
