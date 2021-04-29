package com.prueba.demo.Infraestructure.Mapper.Actividad;

import java.util.List;

import com.prueba.demo.Domain.Entity.Actividad;
import com.prueba.demo.Infraestructure.Models.ActividadModel;

public interface IActividadMapper {
    List<Actividad> MapList(List<ActividadModel> objetos);

    Actividad MapActividad(ActividadModel objeto);

    ActividadModel MapActividadModel(Actividad objeto);
}
