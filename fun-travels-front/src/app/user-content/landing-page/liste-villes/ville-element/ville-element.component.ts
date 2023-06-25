import { EmplacementService } from './../../../../services/emplacement.service';
import { Ville } from './../../../../models/Ville.model';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-ville-element',
  templateUrl: './ville-element.component.html',
  styleUrls: ['./ville-element.component.css'],
})
export class VilleElementComponent implements OnInit {
  @Input() ville?: Ville;

  nb_Places: number = 0;

  constructor(private emplacementService: EmplacementService) {}

  ngOnInit(): void {
    if (this.ville != undefined) {
      this.emplacementService.getNbPlaces(this.ville).subscribe((data) => {
        this.nb_Places = data;
      });
    }
  }
}
