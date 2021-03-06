import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Offer} from "../model/offer";

@Injectable()
export class NewOfferService {

  http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  saveOffer(offer: Offer, authentication: string): Observable<any> {
    let headers = new HttpHeaders();
    headers = headers.append('Authorization', 'Basic ' + authentication);
    return this.http.post("http://localhost:8080/annonces", offer, {headers: headers});
  }

}
