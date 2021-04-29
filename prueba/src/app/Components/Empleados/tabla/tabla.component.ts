import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';

//Model
import { Empleado } from '../../../Models/empleado.model';

//Service
import { BackendService } from '../../../Services/backend.service';

@Component({
  selector: 'app-tabla',
  templateUrl: './tabla.component.html',
  styleUrls: ['./tabla.component.css']
})
export class TablaComponent implements OnInit {
  Lista: Empleado[] = [];
  constructor(private service: BackendService) { }

  ngOnInit(): void {
    this.loadEmpleados();
  }

  loadEmpleados() {
    this.service.getListEmpleados().subscribe(data => {
      this.Lista = data;
    })
  }

  eliminarEmpleado(id: string) {
    this.service.deleteEmpleado(Number(id)).subscribe(data => {
      if (data)
        window.location.reload();
    });
  }

}
