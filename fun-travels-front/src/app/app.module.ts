import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { OffreProprietaireComponent } from './user-content/offre-page/offre-proprietaire/offre-proprietaire.component';
import { OffreEmplacementComponent } from './user-content/offre-page/offre-emplacement/offre-emplacement.component';
import { OffreCalendrierComponent } from './user-content/offre-page/offre-calendrier/offre-calendrier.component';
import { OffreConditionsComponent } from './user-content/offre-page/offre-conditions/offre-conditions.component';
import { OffreUnitesComponent } from './user-content/offre-page/offre-unites/offre-unites.component';
import { HttpClientJsonpModule, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { BrowserModule, Title } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { IvyCarouselModule } from 'angular-responsive-carousel';
import { NpnSliderModule } from 'npn-slider';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutPageComponent } from './user-content/about-page/about-page.component';
import { ContactPageComponent } from './user-content/contact-page/contact-page.component';
import { FooterComponent } from './user-content/footer/footer.component';
import { ExploreSliderComponent } from './user-content/landing-page/explore-slider/explore-slider.component';
import { LandingPageComponent } from './user-content/landing-page/landing-page.component';
import { ListeOffresComponent } from './user-content/landing-page/liste-offres/liste-offres.component';
import { OffreElementComponent } from './user-content/landing-page/liste-offres/offre-element/offre-element.component';
import { ListeVillesComponent } from './user-content/landing-page/liste-villes/liste-villes.component';
import { VilleElementComponent } from './user-content/landing-page/liste-villes/ville-element/ville-element.component';
import { MainSearchComponent } from './user-content/landing-page/main-search/main-search.component';
import { FilterFormComponent } from './user-content/liste-offres-page/filter-form/filter-form.component';
import { ListeOffresPageComponent } from './user-content/liste-offres-page/liste-offres-page.component';
import { NavbarComponent } from './user-content/navbar/navbar.component';
import { OffreEquipementComponent } from './user-content/offre-page/offre-equipement/offre-equipement.component';
import { OffrePageComponent } from './user-content/offre-page/offre-page.component';
import { OffreReservationComponent } from './user-content/offre-page/offre-reservation/offre-reservation.component';
import { OffreSliderComponent } from './user-content/offre-page/offre-slider/offre-slider.component';
import { PageNotFoundComponent } from './user-content/page-not-found/page-not-found.component';
import { SearchModalComponent } from './user-content/search-modal/search-modal.component';
import { UserContentComponent } from './user-content/user-content.component';
import { MesOffresPageComponent } from './user-content/mes-offres-page/mes-offres-page.component';
import { MesReservationsPageComponent } from './user-content/mes-reservations-page/mes-reservations-page.component';
import { AdminContentComponent } from './admin-content/admin-content.component';
import { ConnexionComponent } from './auth/connexion/connexion.component';
import { InscriptionComponent } from './auth/inscription/inscription.component';
import { NgxStripeModule } from 'ngx-stripe';
import { PaiementAreaComponent } from './user-content/offre-page/offre-reservation/paiement-area/paiement-area.component';

@NgModule({
  declarations: [
    AppComponent,
    ExploreSliderComponent,
    LandingPageComponent,
    NavbarComponent,
    FooterComponent,
    SearchModalComponent,
    MainSearchComponent,
    ListeVillesComponent,
    ListeOffresComponent,
    VilleElementComponent,
    OffreElementComponent,
    ListeOffresPageComponent,
    FilterFormComponent,
    AboutPageComponent,
    ContactPageComponent,
    PageNotFoundComponent,
    OffrePageComponent,
    OffreSliderComponent,
    OffreReservationComponent,
    OffreEquipementComponent,
    OffreUnitesComponent,
    OffreConditionsComponent,
    OffreCalendrierComponent,
    OffreEmplacementComponent,
    OffreProprietaireComponent,
    UserContentComponent,
    MesOffresPageComponent,
    MesReservationsPageComponent,
    AdminContentComponent,
    ConnexionComponent,
    InscriptionComponent,
    PaiementAreaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    NpnSliderModule,
    FormsModule,
    IvyCarouselModule,
    ReactiveFormsModule,
    HttpClientJsonpModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    FontAwesomeModule,
  ],
  providers: [Title],
  bootstrap: [AppComponent],
})
export class AppModule {}
