package com.prueba.demo.Application.UseCases;

import java.util.List;

import com.prueba.demo.Application.DTO.UsuarioDTO;
import com.prueba.demo.Application.Mapper.Usuario.UsuarioDTOMapper;
import com.prueba.demo.Application.UseCases.Interfaces.IUsuarioUseCase;
import com.prueba.demo.Context.UsuarioJPA;
import com.prueba.demo.Domain.Service.UsuarioService;

import org.modelmapper.ModelMapper;

public class UsuarioUseCase implements IUsuarioUseCase {
    private final UsuarioService _service;
    private final UsuarioDTOMapper _mapper;

    public UsuarioUseCase(UsuarioJPA repository) {
        this._service = new UsuarioService(repository);
        this._mapper = new UsuarioDTOMapper(new ModelMapper());
    }

    @Override
    public List<UsuarioDTO> Todos() {
        return _mapper.MapList(_service.Todos());
    }

}
