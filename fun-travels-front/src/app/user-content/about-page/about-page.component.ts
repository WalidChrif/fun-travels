import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about-page',
  templateUrl: './about-page.component.html',
  styleUrls: ['./about-page.component.css'],
})
export class AboutPageComponent implements OnInit {
  nbOffres: number = 0;
  nbOffresPerYear: number = 0;
  nbClients: number = 0;

  constructor() {}

  ngOnInit(): void {}
}
