import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MesOffresPageComponent } from './mes-offres-page.component';

describe('MesOffresPageComponent', () => {
  let component: MesOffresPageComponent;
  let fixture: ComponentFixture<MesOffresPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MesOffresPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MesOffresPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
