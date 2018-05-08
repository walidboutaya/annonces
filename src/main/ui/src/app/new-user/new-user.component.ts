import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {User} from "./user";
import {NewUserService} from "./new-user.service";
import {Router} from "@angular/router";
import {CookiesService} from "../cookies.service";

@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css'],
  providers: [NewUserService, CookiesService]
})
export class NewUserComponent implements OnInit {

  userForm: FormGroup;
  newUserService: NewUserService;
  router: Router;

  successMessage: string = undefined;

  constructor(newUserService: NewUserService, router: Router) {
    this.newUserService = newUserService;
    this.router = router;
  }

  ngOnInit() {
    this.userForm = new FormGroup({
      email: new FormControl(''),
      password: new FormControl(''),
      firstName: new FormControl(''),
      familyName: new FormControl(''),
      phone: new FormControl('')
    })
  }

  register() {
    let user: User = {
      username: this.userForm.get("email").value,
      password: this.userForm.get("password").value,
      lastName: this.userForm.get("familyName").value,
      firstName: this.userForm.get("firstName").value,
      phone: this.userForm.get("phone").value
    }

    this.newUserService.createUser(user)
      .subscribe(response => {

        this.successMessage = 'La création de votre compte est réussie; Vous devez vous authentifier';

        setTimeout(() => {
            this.router.navigate(["/login"]);
          },
          3000);
      })
  }
}
