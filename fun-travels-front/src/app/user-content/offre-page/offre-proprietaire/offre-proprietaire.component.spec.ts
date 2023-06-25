import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreProprietaireComponent } from './offre-proprietaire.component';

describe('OffreProprietaireComponent', () => {
  let component: OffreProprietaireComponent;
  let fixture: ComponentFixture<OffreProprietaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreProprietaireComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreProprietaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
