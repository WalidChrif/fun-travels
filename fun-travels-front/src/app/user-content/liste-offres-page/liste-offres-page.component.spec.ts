import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeOffresPageComponent } from './liste-offres-page.component';

describe('ListeOffresPageComponent', () => {
  let component: ListeOffresPageComponent;
  let fixture: ComponentFixture<ListeOffresPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeOffresPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeOffresPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
