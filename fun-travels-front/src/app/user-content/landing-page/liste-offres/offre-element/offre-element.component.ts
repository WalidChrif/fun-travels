import { Offre } from './../../../../models/Offre.model';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-offre-element',
  templateUrl: './offre-element.component.html',
  styleUrls: ['./offre-element.component.css'],
})
export class OffreElementComponent implements OnInit {
  @Input() offre?: Offre;

  constructor() {}

  ngOnInit(): void {}
}
