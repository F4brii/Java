import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

//Models
import { Actividad } from '../../../Models/actividad.model';

//Service
import {   BackendService} from '../../../Services/backend.service';

@Component({
  selector: 'app-tabla-actividad',
  templateUrl: './tabla-actividad.component.html',
  styleUrls: ['./tabla-actividad.component.css']
})
export class TablaActividadComponent implements OnInit {

  Actividades: Actividad[] = [];
  constructor(private service: BackendService, private router: ActivatedRoute) { }

  ngOnInit(): void {
    this.ActividadesLoad();
  }

  ActividadesLoad() {
    this.service.getListActividads(+this.router.snapshot.params.id).subscribe(data => {
      this.Actividades = data;
    })
  }

}
