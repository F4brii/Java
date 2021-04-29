import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaComponentActividad } from './lista.component';

describe('ListaComponent', () => {
  let component: ListaComponentActividad;
  let fixture: ComponentFixture<ListaComponentActividad>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaComponentActividad ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaComponentActividad);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
