import { Component } from "@angular/core";

@Component({
  selector: "spl-nav-bar",
  styleUrls: ["./navBar.component.scss"],
  templateUrl: "./navBar.component.html"
})
export class NavBarComponent {
  title: string = "Scrum Poker Live";
}