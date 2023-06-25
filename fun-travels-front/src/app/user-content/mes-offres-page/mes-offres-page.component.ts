import {
  faEye,
  faList,
  faPlus,
  faTrash,
  IconDefinition,
} from '@fortawesome/free-solid-svg-icons';
import { Image } from './../../models/Image.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mes-offres-page',
  templateUrl: './mes-offres-page.component.html',
  styleUrls: ['./mes-offres-page.component.css'],
})
export class MesOffresPageComponent implements OnInit {
  trashIcon: IconDefinition = faTrash;
  eyeIcon: IconDefinition = faEye;
  listIcon: IconDefinition = faList;
  addIcon: IconDefinition = faPlus;

  images: Image[] = [
    {
      id: 1,
      path: 'https://a0.muscache.com/im/pictures/34bd45a1-dff6-4138-8286-b0000c3487eb.jpg?im_w=960',
      isPrincipal: true,
    },
    {
      id: 2,
      path: 'https://a0.muscache.com/im/pictures/e7052f54-1d28-4754-91ce-86d3fba5e957.jpg?im_w=720',
      isPrincipal: false,
    },
    {
      id: 3,
      path: 'https://a0.muscache.com/im/pictures/c49be6fc-872d-4645-a792-f3641e5b31f9.jpg?im_w=720',
      isPrincipal: false,
    },
    {
      id: 4,
      path: 'https://a0.muscache.com/im/pictures/97990ad4-bcce-417a-ae6b-1d4bbecd5092.jpg?im_w=720',
      isPrincipal: false,
    },
  ];

  constructor() {}

  ngOnInit(): void {}
}
