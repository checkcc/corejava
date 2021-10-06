import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpcustomermoduleComponent } from './addpcustomermodule.component';

describe('AddpcustomermoduleComponent', () => {
  let component: AddpcustomermoduleComponent;
  let fixture: ComponentFixture<AddpcustomermoduleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpcustomermoduleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddpcustomermoduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
