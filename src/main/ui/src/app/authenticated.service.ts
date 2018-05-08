import { Injectable } from '@angular/core';
import {Observable} from "rxjs/Observable";
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable()
export class AuthenticatedService {

  http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  isAuthenticated(authentication: string): Observable<any> {
    let headers = new HttpHeaders();
    headers = headers.append('Authorization', 'Basic ' + authentication);

    return this.http.get("http://localhost:8080/authenticated", {headers: headers});
  }

}
