import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VilleElementComponent } from './ville-element.component';

describe('VilleElementComponent', () => {
  let component: VilleElementComponent;
  let fixture: ComponentFixture<VilleElementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VilleElementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VilleElementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
