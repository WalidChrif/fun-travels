import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreEquipementComponent } from './offre-equipement.component';

describe('OffreEquipementComponent', () => {
  let component: OffreEquipementComponent;
  let fixture: ComponentFixture<OffreEquipementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreEquipementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreEquipementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
