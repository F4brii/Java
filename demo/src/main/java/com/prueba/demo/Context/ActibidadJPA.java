package com.prueba.demo.Context;

import java.util.List;

import com.prueba.demo.Infraestructure.Models.ActividadModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ActibidadJPA extends JpaRepository<ActividadModel, Long> {
    List<ActividadModel> findAllEmpleado(Long id);
}
