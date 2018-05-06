import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToolbarComponent} from './toolbar/toolbar.component';
import {
  MatButtonModule, MatCardModule, MatFormFieldModule, MatGridListModule, MatIconModule, MatInputModule, MatSelectModule,
  MatToolbarModule
} from "@angular/material";
import {OffersComponent} from './offers/offers.component';
import {NewOfferComponent} from './new-offer/new-offer.component';
import {NewUserComponent} from './new-user/new-user.component';
import {RouterModule, Routes} from "@angular/router";
import {FormsModule} from "@angular/forms";
import { OfferListComponent } from './offers/offer-list/offer-list.component';
import {HttpClientModule} from "@angular/common/http";

const appRoutes: Routes = [
  { path: '', redirectTo: 'offers', pathMatch: 'full'},
  { path: 'offers', component: OffersComponent },
  { path: 'newOffer', component: NewOfferComponent },
  { path: 'newUser', component: NewUserComponent },
]

@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    OffersComponent,
    NewOfferComponent,
    NewUserComponent,
    OfferListComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    MatIconModule,
    MatToolbarModule,
    MatButtonModule,
    MatCardModule,
    MatFormFieldModule,
    MatGridListModule,
    MatInputModule,
    MatSelectModule,
    RouterModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
