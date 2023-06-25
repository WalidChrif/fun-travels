import { OffreService } from './../../../services/offre.service';
import { Offre } from './../../../models/Offre.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-liste-offres',
  templateUrl: './liste-offres.component.html',
  styleUrls: ['./liste-offres.component.css'],
})
export class ListeOffresComponent implements OnInit {
  randomOffres: Offre[] = [];

  constructor(private offreService: OffreService) {}

  ngOnInit(): void {
    this.offreService.getRandomOffres().subscribe((data) => {
      this.randomOffres = data;
    });
  }
}
