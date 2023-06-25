import { NgbDate } from '@ng-bootstrap/ng-bootstrap';
import { map } from 'rxjs/operators';
import { Reservation } from './../models/Reservation.model';
import { HttpClient } from '@angular/common/http';
import { Offre } from './../models/Offre.model';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ReservationService {
  private baseUrl = 'http://localhost:8080/api/reservations';

  dateFrom: Subject<NgbDate> = new BehaviorSubject<NgbDate>(null);
  dateTo: Subject<NgbDate> = new BehaviorSubject<NgbDate>(null);

  constructor(private httpClient: HttpClient) {}

  getReservationsByOffre(offre: Offre) {
    const url = this.baseUrl + '/reservationsByOffre/' + offre.id;

    return this.httpClient
      .get<Reservation[]>(url)
      .pipe(map((response) => response));
  }
}
