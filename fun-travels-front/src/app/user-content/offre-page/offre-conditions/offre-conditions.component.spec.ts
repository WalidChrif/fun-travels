import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreConditionsComponent } from './offre-conditions.component';

describe('OffreConditionsComponent', () => {
  let component: OffreConditionsComponent;
  let fixture: ComponentFixture<OffreConditionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreConditionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreConditionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
