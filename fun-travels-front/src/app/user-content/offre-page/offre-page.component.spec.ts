import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OffrePageComponent } from './offre-page.component';

describe('OffrePageComponent', () => {
  let component: OffrePageComponent;
  let fixture: ComponentFixture<OffrePageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OffrePageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OffrePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
