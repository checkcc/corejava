import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddusermoduleComponent } from './addusermodule.component';

describe('AddusermoduleComponent', () => {
  let component: AddusermoduleComponent;
  let fixture: ComponentFixture<AddusermoduleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddusermoduleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddusermoduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
