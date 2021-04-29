package com.prueba.demo.Application.UseCases;

import java.util.List;

import com.prueba.demo.Application.DTO.ActividadDTO;
import com.prueba.demo.Application.Mapper.Actividad.ActividadMapperDTO;
import com.prueba.demo.Application.UseCases.Interfaces.IActividadUseCase;
import com.prueba.demo.Context.ActibidadJPA;
import com.prueba.demo.Domain.Service.ActividadService;

import org.modelmapper.ModelMapper;

public class ActividadUseCase implements IActividadUseCase {

    private final ActividadService _service;
    private final ActividadMapperDTO _mapper;

    public ActividadUseCase(ActibidadJPA repository) {
        this._service = new ActividadService(repository);
        this._mapper = new ActividadMapperDTO(new ModelMapper());
    }

    @Override
    public List<ActividadDTO> Todos() {
        return _mapper.MapList(_service.Todos());
    }

    @Override
    public ActividadDTO CrearActividad(ActividadDTO objeto) {
        return _mapper.MapActividadDTO(_service.CrearActividad(_mapper.MapActividad(objeto)));
    }

    @Override
    public List<ActividadDTO> ActividadesId(Long id) {
        return _mapper.MapList(_service.ActividadesEmpleados(id));
    }
    
}
