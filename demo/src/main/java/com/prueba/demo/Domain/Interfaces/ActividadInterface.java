package com.prueba.demo.Domain.Interfaces;

import java.util.List;

import com.prueba.demo.Domain.Entity.Actividad;

public interface ActividadInterface {
    List<Actividad> Todos();

    Actividad CrearActividad(Actividad objeto);

    List<Actividad> ActividadesId(Long id);
}
