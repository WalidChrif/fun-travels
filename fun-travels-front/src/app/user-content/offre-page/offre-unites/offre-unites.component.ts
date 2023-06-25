import { Unite } from './../../../models/Unite.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-offre-unites',
  templateUrl: './offre-unites.component.html',
  styleUrls: ['./offre-unites.component.css'],
})
export class OffreUnitesComponent implements OnInit {
  // @Input() unites: Unite[];
  unites: Unite[] = [
    {
      id: 1,
      nom: 'Chambre',
      nombre: 3,
    },
    {
      id: 2,
      nom: 'Salle de bain',
      nombre: 1,
    },
    {
      id: 3,
      nom: 'Terrasse',
      nombre: 1,
    },
  ];

  constructor() {}

  ngOnInit(): void {}
}
