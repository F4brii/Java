import { Injectable } from '@angular/core';

//Client
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';

//Models
import { Empleado } from '../Models/empleado.model';
import { Actividad } from '../Models/actividad.model';

@Injectable({
  providedIn: 'root'
})
export class BackendService {
  restUrl = "http://localhost:90"

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  getListEmpleados(): Observable<Empleado[]>{
    return this.http.get<Empleado[]>( `${this.restUrl}/api/v1/empleados` );
  }

  getListActividads(id: number): Observable<Actividad[]>{
    return this.http.get<Actividad[]>( `${this.restUrl}/api/v1/actividades/${id}` );
  }

  crearActividad(actividad: Actividad):Observable<Actividad>{
    return this.http.post<Actividad>(`${this.restUrl}/api/v1/actividades`, actividad, this.httpOptions);
  }

  crearEmpleado(empleado: Empleado):Observable<Empleado>{
    return this.http.post<Empleado>(`${this.restUrl}/api/v1/empleados`, empleado, this.httpOptions);
  }

  deleteEmpleado(id: number): Observable<boolean>{
    return this.http.delete<boolean>(`${this.restUrl}/api/v1/empleados/${id}`);
  }
}
