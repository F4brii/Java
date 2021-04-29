package com.prueba.demo.Context;

import com.prueba.demo.Infraestructure.Models.EmpleadoModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoJPA extends JpaRepository<EmpleadoModel, Long> {
    
}
