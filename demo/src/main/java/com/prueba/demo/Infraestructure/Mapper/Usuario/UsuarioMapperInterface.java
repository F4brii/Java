package com.prueba.demo.Infraestructure.Mapper.Usuario;

import java.util.List;

import com.prueba.demo.Domain.Entity.Usuario;
import com.prueba.demo.Infraestructure.Models.UsuarioModel;

public interface UsuarioMapperInterface {
    List<Usuario> MapList(List<UsuarioModel> objetos);
    UsuarioModel toEntity(Usuario objeto);
}
