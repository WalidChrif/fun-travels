import { Offre } from './../../../models/Offre.model';
import { Component, Input, OnInit } from '@angular/core';
import { NgbDate } from '@ng-bootstrap/ng-bootstrap';
import { Reservation } from '../../../models/Reservation.model';
import { ReservationService } from '../../../services/reservation.service';

@Component({
  selector: 'app-offre-calendrier',
  templateUrl: './offre-calendrier.component.html',
  styleUrls: ['./offre-calendrier.component.css'],
})
export class OffreCalendrierComponent implements OnInit {
  @Input() offre: Offre;

  reservations: Reservation[] = [];

  reservationLoaded: boolean = false;

  //attributes
  hoveredDate: NgbDate | null = null;
  fromDate: NgbDate;
  toDate: NgbDate | null = null;

  startDate: NgbDate = new NgbDate(
    new Date().getFullYear(),
    new Date().getMonth() + 1,
    new Date().getDate()
  );

  endDate: NgbDate;

  isDisabled = (date: NgbDate, current: { month: number }) => {
    let isTrue: boolean = false;

    if (this.reservations.length > 0) {
      this.reservations.map((reservation) => {
        let formatedArrivee = this.formatDate(reservation.date_arrivee);
        let formatedDepart = this.formatDate(reservation.date_depart);

        if (
          date.equals(formatedArrivee) ||
          date.equals(formatedDepart) ||
          (date.after(formatedArrivee) && date.before(formatedDepart))
        ) {
          isTrue = true;
        }
      });
    }

    return isTrue;
  };
  formatDate(date: Date): any {
    let newDate = new Date(date);
    let year = newDate.getFullYear();
    let month = newDate.getMonth() + 1;
    let day = newDate.getDate();

    return { year: year, month: month, day: day };
  }

  constructor(private reservationService: ReservationService) {}

  ngOnInit(): void {
    if (this.offre) {
      this.reservationService.getReservationsByOffre(this.offre).subscribe(
        (data) => {
          this.reservations = data;
          this.endDate = this.formatDate(this.offre.dispo_jusque);
        },
        (error) => {
          console.log(error);
        },
        () => {
          this.reservationLoaded = true;
        }
      );
    }
    this.reservationService.dateFrom.subscribe((data) => {
      this.fromDate = data;
    });
    this.reservationService.dateTo.subscribe((data) => {
      this.toDate = data;
    });
  }

  onDateSelection(date: NgbDate) {
    if (!this.fromDate && !this.toDate) {
      this.fromDate = date;
      this.reservationService.dateFrom.next(date);
    } else if (
      this.fromDate &&
      !this.toDate &&
      date &&
      date.after(this.fromDate)
    ) {
      this.toDate = date;
      this.reservationService.dateTo.next(date);
    } else {
      this.toDate = null;
      this.fromDate = date;
      this.reservationService.dateTo.next(null);
      this.reservationService.dateFrom.next(date);
    }
  }

  isHovered(date: NgbDate) {
    return (
      this.fromDate &&
      !this.toDate &&
      this.hoveredDate &&
      date.after(this.fromDate) &&
      date.before(this.hoveredDate)
    );
  }

  isInside(date: NgbDate) {
    return this.toDate && date.after(this.fromDate) && date.before(this.toDate);
  }

  isRange(date: NgbDate) {
    return (
      date.equals(this.fromDate) ||
      (this.toDate && date.equals(this.toDate)) ||
      this.isInside(date) ||
      this.isHovered(date)
    );
  }
}
