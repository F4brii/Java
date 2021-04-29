package com.prueba.demo.Application.Mapper.Actividad;

import java.util.List;

import com.prueba.demo.Application.DTO.ActividadDTO;
import com.prueba.demo.Domain.Entity.Actividad;

public interface IActividadMapperDTO {
    List<ActividadDTO> MapList(List<Actividad> objetos);

    ActividadDTO MapActividadDTO(Actividad objeto);

    Actividad MapActividad(ActividadDTO objeto);
}
