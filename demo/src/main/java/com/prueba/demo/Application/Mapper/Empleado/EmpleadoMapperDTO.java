package com.prueba.demo.Application.Mapper.Empleado;

import java.util.ArrayList;
import java.util.List;

import com.prueba.demo.Application.DTO.EmpleadoDTO;
import com.prueba.demo.Domain.Entity.Empleado;

import org.modelmapper.ModelMapper;

public class EmpleadoMapperDTO implements IEmpleadoMapperDTO {

    private final ModelMapper mapper;
    
    public EmpleadoMapperDTO(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<EmpleadoDTO> MapList(List<Empleado> objetos) {
        if(objetos == null)
            return null;
            
        List<EmpleadoDTO> list = new ArrayList(objetos.size());
        for (Empleado empleado : objetos) {
            EmpleadoDTO objeto = mapper.map(empleado, EmpleadoDTO.class);
            list.add(objeto);
        }
        return list;
    }

    @Override
    public EmpleadoDTO MapEmpleadoDTO(Empleado objeto) {
        return mapper.map(objeto, EmpleadoDTO.class);
    }

    @Override
    public Empleado MapEmpleado(EmpleadoDTO objeto) {
        return mapper.map(objeto, Empleado.class);
    }
    
}
