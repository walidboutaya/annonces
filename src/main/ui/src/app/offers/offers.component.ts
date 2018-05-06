import {Component, Input, OnInit, ViewChild} from '@angular/core';
import {ConstService} from "../const.service";
import {OfferListComponent} from "./offer-list/offer-list.component";

@Component({
  selector: 'app-offers',
  templateUrl: './offers.component.html',
  styleUrls: ['./offers.component.css'],
  providers: [ConstService]
})
export class OffersComponent implements OnInit {

  private constants: ConstService;

  categories: any[];
  wilayas: string[];

  title: string;
  category: string;
  minPrice: number;
  maxPrice: number;
  wilaya: string;

  @ViewChild('offers')
  private listOfferCompenent: OfferListComponent;

  constructor(constants: ConstService) {
    this.constants = constants;
  }

  ngOnInit() {
    this.categories = this.constants.getCategories();
    this.wilayas = this.constants.getWilayas();
  }

  search() {
    this.listOfferCompenent.search();
  }
}
