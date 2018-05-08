import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {AuthenticatedService} from "../authenticated.service";
import {Router} from "@angular/router";
import {CookiesService} from "../cookies.service";

@Component({
  selector: 'app-authentication',
  templateUrl: './authentication.component.html',
  styleUrls: ['./authentication.component.css'],
  providers: [AuthenticatedService, CookiesService],
})
export class AuthenticationComponent implements OnInit {

  loginForm: FormGroup;
  authenticatedService: AuthenticatedService;
  router: Router;
  cookiesService: CookiesService;

  successMessage: string;
  authenticated: boolean = false;

  constructor(authenticatedService: AuthenticatedService, router: Router, cookiesService: CookiesService) {
    this.authenticatedService = authenticatedService;
    this.router = router;
    this.cookiesService = cookiesService;
  }

  ngOnInit() {
    this.loginForm = new FormGroup({
      username: new FormControl(''),
      password: new FormControl('')
    });
  }

  login() {
    let username = this.loginForm.get("username").value;
    let password = this.loginForm.get("password").value;
    let auth = btoa(username + ":" + password);
    this.authenticatedService.isAuthenticated(auth)
      .subscribe(response => {
        this.successMessage = 'login réussi, vous pouvez déposer une annonce';
        this.cookiesService.setCookie('auth', auth);
        setTimeout(() =>
          {
            this.router.navigate(["/newOffer"]);
          },
          3000);
      })
  }

}
