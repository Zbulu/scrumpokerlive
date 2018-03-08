import { NgModule } from "@angular/core";
import { ExtraOptions, RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";
import { NotFoundComponent } from "./notFound.component";

const ROUTES: Routes = [
  {
    path: "home",
    component: HomeComponent
  },
  {
    path: "",
    redirectTo: "/home",
    pathMatch: "full"
  },
  {
    path: "**",
    component: NotFoundComponent
  }
];

const ROUTER_CONFIG: ExtraOptions = {
  useHash: true,
  enableTracing: true
};

@NgModule({
  imports: [
    RouterModule.forRoot(ROUTES, ROUTER_CONFIG)
  ],
  declarations: [],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
