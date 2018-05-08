import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "./user";
import {Observable} from "rxjs/Observable";

@Injectable()
export class NewUserService {

  http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  createUser(user: User): Observable<any> {
    return this.http.post("http://localhost:8080/users", user);
  }

}
