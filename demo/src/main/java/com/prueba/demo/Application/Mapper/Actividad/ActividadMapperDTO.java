package com.prueba.demo.Application.Mapper.Actividad;

import java.util.ArrayList;
import java.util.List;

import com.prueba.demo.Application.DTO.ActividadDTO;
import com.prueba.demo.Domain.Entity.Actividad;

import org.modelmapper.ModelMapper;

public class ActividadMapperDTO implements IActividadMapperDTO {
    private final ModelMapper mapper;
    
    public ActividadMapperDTO(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<ActividadDTO> MapList(List<Actividad> objetos) {
        if(objetos == null)
            return null;
            
        List<ActividadDTO> list = new ArrayList(objetos.size());
        for (Actividad actividad : objetos) {
            ActividadDTO objeto = mapper.map(actividad, ActividadDTO.class);
            list.add(objeto);
        }
        return list;
    }

    @Override
    public ActividadDTO MapActividadDTO(Actividad objeto) {
        return mapper.map(objeto, ActividadDTO.class);
    }

    @Override
    public Actividad MapActividad(ActividadDTO objeto) {
        return mapper.map(objeto, Actividad.class);
    }
    
}
