import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreElementComponent } from './offre-element.component';

describe('OffreElementComponent', () => {
  let component: OffreElementComponent;
  let fixture: ComponentFixture<OffreElementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreElementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreElementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
