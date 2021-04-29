import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaComponent } from './Components/Empleados/lista/lista.component';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { TablaComponent } from './Components/Empleados/tabla/tabla.component';

import { HttpClientModule } from '@angular/common/http';
import { TablaActividadComponent } from './Components/Actividades/tabla-actividad/tabla-actividad.component'
import { ListaComponentActividad } from './Components/Actividades/lista/lista.component';
import { CrearActividadComponent } from './Components/Actividades/crear-actividad/crear-actividad.component';
import { CrearEmpleadoComponent } from './Components/Empleados/crear-empleado/crear-empleado.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaComponent,
    NavbarComponent,
    TablaComponent,
    ListaComponentActividad,
    TablaActividadComponent,
    CrearActividadComponent,
    CrearEmpleadoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
