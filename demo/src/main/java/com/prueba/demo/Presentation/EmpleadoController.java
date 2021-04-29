package com.prueba.demo.Presentation;

import java.util.List;

import com.prueba.demo.Application.DTO.EmpleadoDTO;
import com.prueba.demo.Application.UseCases.EmpleadoUseCase;
import com.prueba.demo.Context.EmpleadoJPA;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/v1/empleados")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EmpleadoController {
    private final EmpleadoUseCase _useCase;

    public EmpleadoController(EmpleadoJPA repository) {
        this._useCase = new EmpleadoUseCase(repository);
    }

    @GetMapping
    ResponseEntity<List<EmpleadoDTO>> Todos() {
        try {
            return new ResponseEntity<List<EmpleadoDTO>>(_useCase.Todos(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<EmpleadoDTO>>(_useCase.Todos(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    ResponseEntity<EmpleadoDTO> NuevoEmpleado(@RequestBody EmpleadoDTO objeto) {
        try {
            return new ResponseEntity<EmpleadoDTO>(_useCase.CrearEmpleado(objeto), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<EmpleadoDTO>(_useCase.CrearEmpleado(objeto), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("{id}")
    boolean EliminarEmpleado(@PathVariable Long id) {
        return _useCase.EliminarEmpleado((Long)id);
    }
}
