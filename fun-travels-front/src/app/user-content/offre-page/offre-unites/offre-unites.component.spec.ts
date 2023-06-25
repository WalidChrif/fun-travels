import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreUnitesComponent } from './offre-unites.component';

describe('OffreUnitesComponent', () => {
  let component: OffreUnitesComponent;
  let fixture: ComponentFixture<OffreUnitesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreUnitesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreUnitesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
