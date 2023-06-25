import { MesReservationsPageComponent } from './user-content/mes-reservations-page/mes-reservations-page.component';
import { MesOffresPageComponent } from './user-content/mes-offres-page/mes-offres-page.component';
import { UserContentComponent } from './user-content/user-content.component';
import { PageNotFoundComponent } from './user-content/page-not-found/page-not-found.component';
import { OffrePageComponent } from './user-content/offre-page/offre-page.component';
import { ContactPageComponent } from './user-content/contact-page/contact-page.component';
import { AboutPageComponent } from './user-content/about-page/about-page.component';
import { ListeOffresPageComponent } from './user-content/liste-offres-page/liste-offres-page.component';
import { LandingPageComponent } from './user-content/landing-page/landing-page.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    component: UserContentComponent,
    children: [
      { path: '', component: LandingPageComponent, pathMatch: 'full' },
      { path: 'accueil', component: LandingPageComponent },
      { path: 'liste-offres', component: ListeOffresPageComponent },
      { path: 'about', component: AboutPageComponent },
      { path: 'contact', component: ContactPageComponent },
      { path: 'liste-offres/:id', component: OffrePageComponent },
      { path: 'mes-offres', component: MesOffresPageComponent },
      { path: 'mes-reservations', component: MesReservationsPageComponent },
      { path: '**', component: PageNotFoundComponent },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
