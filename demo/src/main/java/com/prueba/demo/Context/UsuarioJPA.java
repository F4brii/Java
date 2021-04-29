package com.prueba.demo.Context;

import com.prueba.demo.Infraestructure.Models.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJPA extends JpaRepository<UsuarioModel, Long> {
}
