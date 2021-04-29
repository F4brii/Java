package com.prueba.demo.Application.Mapper.Usuario;

import java.util.ArrayList;
import java.util.List;

import com.prueba.demo.Application.DTO.UsuarioDTO;
import com.prueba.demo.Domain.Entity.Usuario;

import org.modelmapper.ModelMapper;

public class UsuarioDTOMapper implements UsuarioDTOMapperInterface {

    private final ModelMapper mapper;
    
    public UsuarioDTOMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }
    
    @Override
    public List<UsuarioDTO> MapList(List<Usuario> objetos) {
        if(objetos == null)
            return null;
            
        List<UsuarioDTO> list = new ArrayList(objetos.size());
        for (Usuario usuario : objetos) {
            UsuarioDTO objeto = mapper.map(usuario, UsuarioDTO.class);
            list.add(objeto);
        }
        return list;
    }
    
}
