import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreCalendrierComponent } from './offre-calendrier.component';

describe('OffreCalendrierComponent', () => {
  let component: OffreCalendrierComponent;
  let fixture: ComponentFixture<OffreCalendrierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreCalendrierComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreCalendrierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
