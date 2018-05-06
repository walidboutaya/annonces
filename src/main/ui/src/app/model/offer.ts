import {Address} from "./address";

export class Offer {
  id: string;
  title: string;
  details: string;
  price: number;
  photos: string[];
  date: string;
  subCategory: string;
  address: Address = new Address();
}
