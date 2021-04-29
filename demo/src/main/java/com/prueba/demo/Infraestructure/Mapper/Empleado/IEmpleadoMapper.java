package com.prueba.demo.Infraestructure.Mapper.Empleado;

import java.util.List;

import com.prueba.demo.Domain.Entity.Empleado;
import com.prueba.demo.Infraestructure.Models.EmpleadoModel;

public interface IEmpleadoMapper {
    List<Empleado> MapList(List<EmpleadoModel> objetos);
    Empleado MapEmpleado(EmpleadoModel objeto);
    EmpleadoModel MapEmpleadoModel(Empleado objeto);
}
