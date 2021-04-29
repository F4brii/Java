import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';

//Models
import { Empleado } from '../../../Models/empleado.model'

//Service
import { BackendService } from '../../../Services/backend.service';

@Component({
  selector: 'app-crear-empleado',
  templateUrl: './crear-empleado.component.html',
  styleUrls: ['./crear-empleado.component.css']
})
export class CrearEmpleadoComponent implements OnInit {

  element!: HTMLElement;

  constructor(private service: BackendService) { }

  ngOnInit(): void {
  }

  crearComponente(nombre: string, apellidos: string, cargo: string) {
    if ((nombre != null && nombre != "") && (apellidos != null && apellidos != "") && (cargo != null && cargo != "") ) {
      var objeto = new Empleado();
      objeto.nombres = nombre;
      objeto.apellidos = apellidos;
      objeto.cargo = cargo;

      this.service.crearEmpleado(objeto).subscribe(data => {
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
