package com.prueba.demo.Domain.Interfaces;

import java.util.List;

import com.prueba.demo.Domain.Entity.Empleado;

public interface EmpleadoInterface {
    List<Empleado> Todos();

    Empleado CrearEmpleado(Empleado objeto);

    boolean EliminarEmpleado(Long id);
}
