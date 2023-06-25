import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreEmplacementComponent } from './offre-emplacement.component';

describe('OffreEmplacementComponent', () => {
  let component: OffreEmplacementComponent;
  let fixture: ComponentFixture<OffreEmplacementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreEmplacementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreEmplacementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
