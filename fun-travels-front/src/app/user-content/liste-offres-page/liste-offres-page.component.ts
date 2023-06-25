import { OffreService } from './../../services/offre.service';
import { Offre } from './../../models/Offre.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-liste-offres-page',
  templateUrl: './liste-offres-page.component.html',
  styleUrls: ['./liste-offres-page.component.css'],
})
export class ListeOffresPageComponent implements OnInit {
  listeOffres: Offre[] = [];

  constructor(private offreService: OffreService) {}

  ngOnInit(): void {
    this.offreService.getRandomOffres().subscribe((data) => {
      this.listeOffres = data;
    });
  }
}
