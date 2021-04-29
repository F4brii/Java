package com.prueba.demo.Infraestructure.Mapper.Usuario;

import java.util.ArrayList;
import java.util.List;

import com.prueba.demo.Domain.Entity.Usuario;
import com.prueba.demo.Infraestructure.Models.UsuarioModel;

import org.modelmapper.ModelMapper;

public class UsuarioMapper implements UsuarioMapperInterface {

    private final ModelMapper mapper;
    
    public UsuarioMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Usuario> MapList(List<UsuarioModel> objetos) {
        if(objetos == null)
            return null;
            
        List<Usuario> list = new ArrayList(objetos.size());
        for (UsuarioModel usuarioModel : objetos) {
            Usuario objeto = mapper.map(usuarioModel, Usuario.class);
            list.add(objeto);
        }
        return list;
    }

    @Override
    public UsuarioModel toEntity(Usuario objeto) {
        return mapper.map(objeto, UsuarioModel.class);
    }
    
}
