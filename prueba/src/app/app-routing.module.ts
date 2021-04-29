import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListaComponent } from './Components/Empleados/lista/lista.component';
import { ListaComponentActividad } from './Components/Actividades/lista/lista.component';
import { CrearActividadComponent } from './Components/Actividades/crear-actividad/crear-actividad.component';

const routes: Routes = [
  { path: '', component: ListaComponent },
  { path: 'actividad/:id', component: ListaComponentActividad },
  { path: 'actividad/:id/crear', component: CrearActividadComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
