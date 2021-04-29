package com.prueba.demo.Application.UseCases;

import java.util.List;

import com.prueba.demo.Application.DTO.EmpleadoDTO;
import com.prueba.demo.Application.Mapper.Empleado.EmpleadoMapperDTO;
import com.prueba.demo.Application.UseCases.Interfaces.IEmpleadoUseCase;
import com.prueba.demo.Context.EmpleadoJPA;
import com.prueba.demo.Domain.Service.EmpleadoService;

import org.modelmapper.ModelMapper;

public class EmpleadoUseCase implements IEmpleadoUseCase {
    private final EmpleadoService _service;
    private final EmpleadoMapperDTO _mapper;

    public EmpleadoUseCase(EmpleadoJPA repository) {
        this._service = new EmpleadoService(repository);
        this._mapper = new EmpleadoMapperDTO(new ModelMapper());
    }

    @Override
    public List<EmpleadoDTO> Todos() {
        return _mapper.MapList(_service.Todos());
    }

    @Override
    public EmpleadoDTO CrearEmpleado(EmpleadoDTO objeto) {
        return _mapper.MapEmpleadoDTO(_service.CrearEmpleado(_mapper.MapEmpleado(objeto)));
    }

    @Override
    public boolean EliminarEmpleado(Long id) {
        return _service.EliminarEmpleado(id);
        
    }
}
