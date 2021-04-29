package com.prueba.demo.Application.Mapper.Usuario;

import java.util.List;

import com.prueba.demo.Application.DTO.UsuarioDTO;
import com.prueba.demo.Domain.Entity.Usuario;

public interface UsuarioDTOMapperInterface {
    List<UsuarioDTO> MapList(List<Usuario> objetos);
}
