import { OffreService } from './../../services/offre.service';
import { Offre } from './../../models/Offre.model';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-offre-page',
  templateUrl: './offre-page.component.html',
  styleUrls: ['./offre-page.component.css'],
})
export class OffrePageComponent implements OnInit {
  offre!: Offre;

  constructor(
    private offreService: OffreService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    const offreId = this.route.snapshot.params['id'];

    this.offreService.getOffreById(offreId).subscribe((data) => {
      this.offre = data;
    });
  }
}
