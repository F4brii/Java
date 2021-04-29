package com.prueba.demo.Domain.Service;

import java.util.List;

import com.prueba.demo.Context.UsuarioJPA;
import com.prueba.demo.Domain.Entity.Usuario;
import com.prueba.demo.Infraestructure.Models.UsuarioModel;
import com.prueba.demo.Infraestructure.Repositories.UsuarioRepository;

public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioJPA _repository) {
        this.repository = new UsuarioRepository(_repository);
    }

    public List<Usuario> Todos() {
        return this.repository.Todos();
    }
}
