import {Component, OnInit} from '@angular/core';
import {ConstService} from "../const.service";
import {Offer} from "../model/offer";
import {NewOfferService} from "./new-offer.service";

@Component({
  selector: 'app-new-offer',
  templateUrl: './new-offer.component.html',
  styleUrls: ['./new-offer.component.css'],
  providers: [ConstService, NewOfferService]
})
export class NewOfferComponent implements OnInit {

  constants: ConstService;
  newOfferService: NewOfferService;

  wilayas: string[];
  categories: any[];
  fileString: string;

  offer: Offer = new Offer;

  constructor(constants: ConstService, newOfferService: NewOfferService) {
    this.constants = constants;
    this.newOfferService = newOfferService;
  }

  ngOnInit() {
    this.offer = new Offer();
    this.wilayas = this.constants.getWilayas();
    this.categories = this.constants.getCategories();
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
    this.newOfferService.saveOffer(this.offer)
      .subscribe(response => {
        console.log(response + " ok");
      })
  }
}
