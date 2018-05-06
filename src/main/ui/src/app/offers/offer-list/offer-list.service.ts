import {Injectable, Input} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class OfferListService {

  http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getOffers(title: string, subCategory: string, minPrice: number, maxPrice: number, wilaya: string): Observable<any> {
    let params = new HttpParams();
    if(title != undefined) {
      params = params.append('title', title);
    }
    if(subCategory != undefined) {
      params = params.append("subCategory", subCategory);
    }
    if(minPrice != undefined) {
      params = params.append("minPrice", minPrice.toString());
    }
    if(maxPrice != undefined) {
      params = params.append("maxPrice", maxPrice.toString());
    }
    if(wilaya != undefined) {
      params = params.append("wilaya", wilaya);
    }
    return this.http.get("http://localhost:8080/annonces", {params: params});
  }
}
