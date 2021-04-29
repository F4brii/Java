package com.prueba.demo.Application.UseCases.Interfaces;

import java.util.List;

import com.prueba.demo.Application.DTO.ActividadDTO;

public interface IActividadUseCase {
    List<ActividadDTO> Todos();
    ActividadDTO CrearActividad(ActividadDTO objeto);
    List<ActividadDTO> ActividadesId(Long id);
}
