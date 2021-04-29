package com.prueba.demo.Infraestructure.Repositories;

import java.util.List;

import com.prueba.demo.Context.EmpleadoJPA;
import com.prueba.demo.Domain.Entity.Empleado;
import com.prueba.demo.Domain.Interfaces.EmpleadoInterface;
import com.prueba.demo.Infraestructure.Mapper.Empleado.EmpleadoMapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpleadoRepository implements EmpleadoInterface  {

    private final EmpleadoJPA _repository;
    private final EmpleadoMapper _mapper;

    @Autowired
    public EmpleadoRepository(EmpleadoJPA _repository) {
        this._repository = _repository;
        this._mapper = new EmpleadoMapper(new ModelMapper());
    }

    @Override
    public List<Empleado> Todos() {
        return _mapper.MapList(_repository.findAll());
    }

    @Override
    public Empleado CrearEmpleado(Empleado objeto) {
        return _mapper.MapEmpleado(_repository.save(_mapper.MapEmpleadoModel(objeto)));
    }

    @Override
    public boolean EliminarEmpleado(Long id) {
        try{
            _repository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }       
    }
    
}
