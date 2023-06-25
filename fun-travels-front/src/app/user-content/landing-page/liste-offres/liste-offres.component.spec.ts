import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeOffresComponent } from './liste-offres.component';

describe('ListeOffresComponent', () => {
  let component: ListeOffresComponent;
  let fixture: ComponentFixture<ListeOffresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeOffresComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeOffresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
