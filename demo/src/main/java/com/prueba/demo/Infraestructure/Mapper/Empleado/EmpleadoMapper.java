package com.prueba.demo.Infraestructure.Mapper.Empleado;

import java.util.ArrayList;
import java.util.List;

import com.prueba.demo.Domain.Entity.Empleado;
import com.prueba.demo.Infraestructure.Models.EmpleadoModel;

import org.modelmapper.ModelMapper;

public class EmpleadoMapper implements IEmpleadoMapper {

    private final ModelMapper mapper;
    
    public EmpleadoMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }
    
    @Override
    public List<Empleado> MapList(List<EmpleadoModel> objetos) {
        if(objetos == null)
            return null;
            
        List<Empleado> list = new ArrayList(objetos.size());
        for (EmpleadoModel empleadoModel : objetos) {
            Empleado objeto = mapper.map(empleadoModel, Empleado.class);
            list.add(objeto);
        }
        return list;
    }

    @Override
    public Empleado MapEmpleado(EmpleadoModel objeto) {
        return mapper.map(objeto, Empleado.class);
    }

    @Override
    public EmpleadoModel MapEmpleadoModel(Empleado objeto) {
        return mapper.map(objeto, EmpleadoModel.class);
    }
    
}
