package com.prueba.demo.Application.UseCases.Interfaces;

import java.util.List;

import com.prueba.demo.Application.DTO.EmpleadoDTO;

public interface IEmpleadoUseCase {
    List<EmpleadoDTO> Todos();
    EmpleadoDTO CrearEmpleado(EmpleadoDTO objeto);
    boolean EliminarEmpleado(Long id);
}
