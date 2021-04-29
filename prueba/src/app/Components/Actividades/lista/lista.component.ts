import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

//Model
import { Actividad } from '../../../Models/actividad.model';

//Service
import { BackendService } from '../../../Services/backend.service';

@Component({
  selector: 'app-lista-actividad',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponentActividad implements OnInit {
  Actividades: Actividad[] = [];
  id: number = 0;
  constructor(private router: ActivatedRoute, private service: BackendService) {
    this.id = this.router.snapshot.params.id
   }

  ngOnInit(): void {
    this.loadActividades();
  }

  loadActividades(){
    this.service.getListActividads(this.router.snapshot.params.id).subscribe(data => {
      this.Actividades = data;
    })
  }

}
