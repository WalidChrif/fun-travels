import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MesReservationsPageComponent } from './mes-reservations-page.component';

describe('MesReservationsPageComponent', () => {
  let component: MesReservationsPageComponent;
  let fixture: ComponentFixture<MesReservationsPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MesReservationsPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MesReservationsPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
