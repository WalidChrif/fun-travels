import { Utilisateur } from './../../../models/Utilisateur.model';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-offre-proprietaire',
  templateUrl: './offre-proprietaire.component.html',
  styleUrls: ['./offre-proprietaire.component.css'],
})
export class OffreProprietaireComponent implements OnInit {
  @Input() proprietaire: Utilisateur;

  constructor() {}

  ngOnInit(): void {}
}
