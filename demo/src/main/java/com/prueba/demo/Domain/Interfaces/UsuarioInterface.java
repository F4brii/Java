package com.prueba.demo.Domain.Interfaces;

import java.util.List;

import com.prueba.demo.Domain.Entity.Usuario;
import com.prueba.demo.Infraestructure.Models.UsuarioModel;

public interface UsuarioInterface {
    List<Usuario> Todos();
}
