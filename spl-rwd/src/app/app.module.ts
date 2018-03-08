import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { DashboardComponent } from "./dashboard/dashboard.component";
import { HomeComponent } from "./home/home.component";
import { MeetingComponent } from "./meeting/meeting.component";
import { NavBarComponent } from "./navbar/navBar.component";
import { NotFoundComponent } from "./notFound.component";
import { MeetingService } from "./service/meeting.service";
import { RestService } from "./service/rest.service";

@NgModule({
  declarations: [
    AppComponent, NavBarComponent, NotFoundComponent, HomeComponent, MeetingComponent, DashboardComponent
  ],
  imports: [
    AppRoutingModule, BrowserModule, FormsModule, HttpClientModule
  ],
  providers: [RestService, MeetingService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
