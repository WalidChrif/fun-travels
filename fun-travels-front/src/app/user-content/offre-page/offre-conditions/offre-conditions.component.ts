import { Condition } from './../../../models/Condition.model';
import { Component, Input, OnInit } from '@angular/core';
import {
  faExclamationTriangle,
  faSmokingBan,
  faSoap,
} from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-offre-conditions',
  templateUrl: './offre-conditions.component.html',
  styleUrls: ['./offre-conditions.component.css'],
})
export class OffreConditionsComponent implements OnInit {
  // @Input() conditions: Condition[];

  conditions: Condition[] = [
    {
      id: 1,
      contenu:
        "Les consignes de fun-travels en matière de distanciation physique et d'autres consignes liées au COVID-19 s'appliquent.",
      icon: faSoap,
    },
    {
      id: 2,
      contenu:
        "Caution - en cas de dommages matériels dans le logement, vous pouvez avoir à payer jusqu'à MAD1500.",
      icon: faExclamationTriangle,
    },
    {
      id: 3,
      contenu: 'Détecteur de fumée.',
      icon: faSmokingBan,
    },
  ];

  constructor() {}

  ngOnInit(): void {}
}
