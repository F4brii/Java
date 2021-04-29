package com.prueba.demo.Domain.Service;

import java.util.List;

import com.prueba.demo.Context.EmpleadoJPA;
import com.prueba.demo.Domain.Entity.Empleado;
import com.prueba.demo.Infraestructure.Repositories.EmpleadoRepository;

public class EmpleadoService {
    private final EmpleadoRepository repository;

    public EmpleadoService(EmpleadoJPA _repository) {
        this.repository = new EmpleadoRepository(_repository);
    }

    public List<Empleado> Todos() {
        return this.repository.Todos();
    }

    public Empleado CrearEmpleado(Empleado objeto){
        return this.repository.CrearEmpleado(objeto);
    }

    public boolean EliminarEmpleado(Long id){
        return this.repository.EliminarEmpleado(id);
    }
}
