package com.prueba.demo.Infraestructure.Repositories;

import java.util.List;

import com.prueba.demo.Context.UsuarioJPA;
import com.prueba.demo.Domain.Entity.Usuario;
import com.prueba.demo.Domain.Interfaces.UsuarioInterface;
import com.prueba.demo.Infraestructure.Mapper.Usuario.UsuarioMapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioRepository implements UsuarioInterface {

    private final UsuarioJPA _repository;
    private final UsuarioMapper _mapper;

    @Autowired
    public UsuarioRepository(UsuarioJPA _repository) {
        this._repository = _repository;
        this._mapper = new UsuarioMapper(new ModelMapper());
    }

    @Override
    public List<Usuario> Todos() {
        return _mapper.MapList(_repository.findAll());
    }

}
