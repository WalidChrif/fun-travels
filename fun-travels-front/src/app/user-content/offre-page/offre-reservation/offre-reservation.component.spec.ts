import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreReservationComponent } from './offre-reservation.component';

describe('OffreReservationComponent', () => {
  let component: OffreReservationComponent;
  let fixture: ComponentFixture<OffreReservationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreReservationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreReservationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
