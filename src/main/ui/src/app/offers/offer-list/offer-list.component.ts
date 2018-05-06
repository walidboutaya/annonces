import {Component, Input, OnInit, ViewChild} from '@angular/core';
import {OfferListService} from "./offer-list.service";
import {Offer} from "../../model/offer";

@Component({
  selector: 'app-offer-list',
  templateUrl: './offer-list.component.html',
  styleUrls: ['./offer-list.component.css'],
  providers: [OfferListService]
})
export class OfferListComponent implements OnInit {

  annonces: Offer[];
  private offerListService: OfferListService

  @Input()
  title: string;
  @Input()
  category: string;
  @Input()
  minPrice: number;
  @Input()
  maxPrice: number;
  @Input()
  wilaya: string;

  constructor(offerListService: OfferListService) {
    this.offerListService = offerListService;
  }

  ngOnInit() {
    /*this.offerListService.getOffers(this.title, this.category, this.minPrice, this.maxPrice, this.wilaya)
      .subscribe(response => {
        this.annonces = response;
      })*/
  }

  search() {
    console.log("list offers");
    this.offerListService.getOffers(this.title, this.category, this.minPrice, this.maxPrice, this.wilaya)
      .subscribe(response => {
        this.annonces = response;
      })
  }
}
