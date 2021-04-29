package com.prueba.demo.Application.Mapper.Empleado;

import java.util.List;

import com.prueba.demo.Application.DTO.EmpleadoDTO;
import com.prueba.demo.Domain.Entity.Empleado;

public interface IEmpleadoMapperDTO {
    List<EmpleadoDTO> MapList(List<Empleado> objetos);
    EmpleadoDTO MapEmpleadoDTO(Empleado objeto);
    Empleado MapEmpleado(EmpleadoDTO objeto);
}
