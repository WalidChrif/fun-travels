import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaiementAreaComponent } from './paiement-area.component';

describe('PaiementAreaComponent', () => {
  let component: PaiementAreaComponent;
  let fixture: ComponentFixture<PaiementAreaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaiementAreaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PaiementAreaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
