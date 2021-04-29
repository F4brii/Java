package com.prueba.demo.Domain.Service;

import java.util.List;

import com.prueba.demo.Context.ActibidadJPA;
import com.prueba.demo.Infraestructure.Repositories.ActividadRepository;
import com.prueba.demo.Domain.Entity.Actividad;

public class ActividadService {
    private final ActividadRepository repository;

    public ActividadService(ActibidadJPA _repository) {
        this.repository = new ActividadRepository(_repository);
    }

    public List<Actividad> Todos() {
        return this.repository.Todos();
    }

    public Actividad CrearActividad(Actividad objeto){
        return this.repository.CrearActividad(objeto);
    }

    public List<Actividad> ActividadesEmpleados(Long id) {
        return this.repository.ActividadesId(id);
    }
}
