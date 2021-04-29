import { Component, Input, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

//Models
import { Actividad } from '../../../Models/actividad.model';

//Service
import { BackendService } from '../../../Services/backend.service';


@Component({
  selector: 'app-crear-actividad',
  templateUrl: './crear-actividad.component.html',
  styleUrls: ['./crear-actividad.component.css']
})
export class CrearActividadComponent implements OnInit {

  @Input() id: number = 0;

  element!: HTMLElement;


  constructor(private service: BackendService) { }

  ngOnInit(): void {
  }

  crearComponente(nombre: string, tiempo: string) {
    if ((nombre != null && nombre != "") && (tiempo != null && tiempo != "")) {
      var objeto = new Actividad();
      objeto.nombre = nombre;
      objeto.tiempo = parseInt(tiempo);
      objeto.fechaRegistro = new Date();
      objeto.idEmpleado = this.id;

      this.service.crearActividad(objeto).subscribe(data => {
        console.log(data);
      });

      this.element = document.getElementById('id01')!;
      this.element.style.display = "none";

      window.location.reload();
    }
  }

  cancelarComponente() {
    this.element = document.getElementById('id01')!;
    this.element.style.display = "none";
  }

}
