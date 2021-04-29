package com.prueba.demo.Infraestructure.Mapper.Actividad;

import java.util.ArrayList;
import java.util.List;

import com.prueba.demo.Domain.Entity.Actividad;
import com.prueba.demo.Infraestructure.Models.ActividadModel;

import org.modelmapper.ModelMapper;

public class ActividadMapper implements IActividadMapper {

    private final ModelMapper mapper;
    
    public ActividadMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Actividad> MapList(List<ActividadModel> objetos) {
        if(objetos == null)
            return null;
            
        List<Actividad> list = new ArrayList(objetos.size());
        for (ActividadModel actividadModel : objetos) {
            Actividad objeto = mapper.map(actividadModel, Actividad.class);
            list.add(objeto);
        }
        return list;
    }

    @Override
    public Actividad MapActividad(ActividadModel objeto) {
        return mapper.map(objeto, Actividad.class);
    }

    @Override
    public ActividadModel MapActividadModel(Actividad objeto) {
        return mapper.map(objeto, ActividadModel.class);
    }
    
}
