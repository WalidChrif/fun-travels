import { Equipement } from './../../../models/Equipement.model';
import { Component, OnInit } from '@angular/core';
import { faHome, faPumpSoap, faWifi } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-offre-equipement',
  templateUrl: './offre-equipement.component.html',
  styleUrls: ['./offre-equipement.component.css'],
})
export class OffreEquipementComponent implements OnInit {
  // @Input() conditions: Condition[];

  equipements: Equipement[] = [
    {
      id: 1,
      icon: faHome,
      titre: 'Logement entier',
      description: 'Vous aurez le logement (appartement) rien que pour vous.',
    },
    {
      id: 2,
      icon: faPumpSoap,
      titre: 'Propre et rangé',
      description:
        "9 voyageurs récents ont indiqué que ce logement était d'une propreté irréprochable.",
    },
    {
      id: 3,
      icon: faWifi,
      titre: 'Wifi',
      description: 'Les voyageurs recherchent souvent cet équipement',
    },
  ];

  constructor() {}

  ngOnInit(): void {}
}
