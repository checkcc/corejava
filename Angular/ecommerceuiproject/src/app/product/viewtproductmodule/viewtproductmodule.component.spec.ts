import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewtproductmoduleComponent } from './viewtproductmodule.component';

describe('ViewtproductmoduleComponent', () => {
  let component: ViewtproductmoduleComponent;
  let fixture: ComponentFixture<ViewtproductmoduleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewtproductmoduleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewtproductmoduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
