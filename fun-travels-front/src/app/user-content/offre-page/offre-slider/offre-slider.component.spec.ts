import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreSliderComponent } from './offre-slider.component';

describe('OffreSliderComponent', () => {
  let component: OffreSliderComponent;
  let fixture: ComponentFixture<OffreSliderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffreSliderComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreSliderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
