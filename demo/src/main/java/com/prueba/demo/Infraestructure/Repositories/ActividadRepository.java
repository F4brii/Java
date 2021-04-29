package com.prueba.demo.Infraestructure.Repositories;

import java.util.List;

import com.prueba.demo.Context.ActibidadJPA;
import com.prueba.demo.Domain.Entity.Actividad;
import com.prueba.demo.Domain.Interfaces.ActividadInterface;
import com.prueba.demo.Infraestructure.Mapper.Actividad.ActividadMapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ActividadRepository implements ActividadInterface {
    private final ActibidadJPA _repository;
    private final ActividadMapper _mapper;

    @Autowired
    public ActividadRepository(ActibidadJPA _repository) {
        this._repository = _repository;
        this._mapper = new ActividadMapper(new ModelMapper());
    }

    @Override
    public List<Actividad> Todos() {
        return _mapper.MapList(_repository.findAll());
    }

    @Override
    public Actividad CrearActividad(Actividad objeto) {
        return _mapper.MapActividad(_repository.save(_mapper.MapActividadModel(objeto)));
    }

    @Override
    public List<Actividad> ActividadesId(Long id) {
        return _mapper.MapList(_repository.findAllEmpleado(id));
    }
}
