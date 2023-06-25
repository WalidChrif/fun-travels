import { map } from 'rxjs/operators';
import { Offre } from './../models/Offre.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class OffreService {
  private baseUrl = 'http://localhost:8080/api/offres';

  constructor(private httpClient: HttpClient) {}

  getRandomOffres() {
    const url = this.baseUrl + '/aleatoires';

      return this.httpClient.get<Offre[]>(url).pipe(map((response) => response));
  }

  getOffreById(id: number) {
    const url = this.baseUrl + '/' + id;

    return this.httpClient.get<Offre>(url);
  }
}
