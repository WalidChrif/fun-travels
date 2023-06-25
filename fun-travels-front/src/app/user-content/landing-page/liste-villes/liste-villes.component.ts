import { VilleService } from './../../../services/ville.service';
import { Ville } from './../../../models/Ville.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-liste-villes',
  templateUrl: './liste-villes.component.html',
  styleUrls: ['./liste-villes.component.css'],
})
export class ListeVillesComponent implements OnInit {
  randomVilles: Ville[] = [];

  constructor(private villeService: VilleService) {}

  ngOnInit(): void {
    this.villeService.getVillesAleatoire().subscribe((data) => {
      this.randomVilles = data;
    });
  }
}
