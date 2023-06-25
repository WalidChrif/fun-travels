import { Ville } from './../models/Ville.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class EmplacementService {
  private baseUrl = 'http://localhost:8080/api/emplacements';

  constructor(private httpClient: HttpClient) {}

  getNbPlaces(ville: Ville) {
    const url = this.baseUrl + '/nb_places?ville_id=' + ville.id;

    return this.httpClient.get<number>(url);
  }
}
