import { Ville } from './../models/Ville.model';
import { map } from 'rxjs/operators';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class VilleService {
  private baseUrl = 'http://localhost:8080/api/villes';

  constructor(private httpClient: HttpClient) {}

  getVillesAleatoire() {
    const url = this.baseUrl + '/aleatoires';
    return this.httpClient.get<Ville[]>(url).pipe(map((response) => response));
  }
}
