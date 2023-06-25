import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-explore-slider',
  templateUrl: './explore-slider.component.html',
  styleUrls: ['./explore-slider.component.css'],
})
export class ExploreSliderComponent implements OnInit {
  images = [
    {
      path: '../../../assets/img/cities/ouarzazat.jpg',
      titre: 'Ouarzazate',
      contenu: '',
    },
    {
      path: '../../../assets/img/cities/chefchaouen.jpg',
      titre: 'Chefchaouen',
      contenu: '',
    },
    {
      path: '../../../assets/img/cities/Marrakech.jpg',
      titre: 'Marrakech',
      contenu: '',
    },
  ];

  ngOnInit(): void {}
}
