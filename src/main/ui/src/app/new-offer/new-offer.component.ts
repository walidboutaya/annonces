import {Component, OnInit} from '@angular/core';
import {ConstService} from "../const.service";
import {Offer} from "../model/offer";
import {NewOfferService} from "./new-offer.service";
import {AuthenticatedService} from "../authenticated.service";
import {CookiesService} from "../cookies.service";

@Component({
  selector: 'app-new-offer',
  templateUrl: './new-offer.component.html',
  styleUrls: ['./new-offer.component.css'],
  providers: [ConstService, NewOfferService, AuthenticatedService, CookiesService]
})
export class NewOfferComponent implements OnInit {

  constants: ConstService;
  newOfferService: NewOfferService;
  authenticatedService: AuthenticatedService;
  cookiesService: CookiesService;

  wilayas: string[];
  categories: any[];
  fileString: string;

  offer: Offer = new Offer;

  authenticated: boolean = false;
  auth: string;

  constructor(constants: ConstService, newOfferService: NewOfferService, authenticatedService: AuthenticatedService, cookiesService: CookiesService) {
    this.constants = constants;
    this.newOfferService = newOfferService;
    this.authenticatedService = authenticatedService;
    this.cookiesService = cookiesService;
  }

  ngOnInit() {
    this.offer = new Offer();
    this.wilayas = this.constants.getWilayas();
    this.categories = this.constants.getCategories();

    this.auth = this.cookiesService.getCookie("auth");

    if(this.auth === '') {
      this.authenticated = false;
    } else {
      this.authenticatedService.isAuthenticated(this.auth)
        .subscribe(res => {
          this.authenticated = true;
        }, err => {
          this.authenticated = false;
        });
    }
  }

  newImage(event: any) {
    let reader = new FileReader();

    reader.onloadend = (e) => {
      this.fileString = reader.result;
    }

    reader.readAsDataURL(event.target.files[0]);

  }

  delete() {
    this.fileString = undefined;
  }

  publish() {
    if(this.fileString) {
      this.offer.photos = [this.fileString];
    }
    this.newOfferService.saveOffer(this.offer, this.auth)
      .subscribe(response => {
        console.log(response + " ok");
      })
  }
}
