package com.prueba.demo.Presentation;

import java.util.List;

import com.prueba.demo.Application.DTO.ActividadDTO;
import com.prueba.demo.Application.UseCases.ActividadUseCase;
import com.prueba.demo.Context.ActibidadJPA;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/v1/actividades")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ActividadController {
    private final ActividadUseCase _useCase;

    public ActividadController(ActibidadJPA repository) {
        this._useCase = new ActividadUseCase(repository);
    }

    @GetMapping
    ResponseEntity<List<ActividadDTO>> Todos() {
        try {
            return new ResponseEntity<List<ActividadDTO>>(_useCase.Todos(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<ActividadDTO>>(_useCase.Todos(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    ResponseEntity<List<ActividadDTO>> Todos(@PathVariable Long id) {
        try {
            return new ResponseEntity<List<ActividadDTO>>(_useCase.ActividadesId(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<ActividadDTO>>(_useCase.ActividadesId(id), HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping
    ResponseEntity<ActividadDTO> NuevoActividad(@RequestBody ActividadDTO objeto) {
        try {
            return new ResponseEntity<ActividadDTO>(_useCase.CrearActividad(objeto), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<ActividadDTO>(_useCase.CrearActividad(objeto), HttpStatus.BAD_REQUEST);
        }
    }
    
}
