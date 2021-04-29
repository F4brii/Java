package com.prueba.demo.Presentation;

import java.util.List;

import com.prueba.demo.Application.DTO.UsuarioDTO;
import com.prueba.demo.Application.UseCases.UsuarioUseCase;
import com.prueba.demo.Context.UsuarioJPA;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    private final UsuarioUseCase _useCase;

    public UsuarioController(UsuarioJPA repository) {
        this._useCase = new UsuarioUseCase(repository);
    }

    @GetMapping
    ResponseEntity<List<UsuarioDTO>> Todos() {
        try {
            return new ResponseEntity<List<UsuarioDTO>>(_useCase.Todos(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<List<UsuarioDTO>>(_useCase.Todos(), HttpStatus.BAD_REQUEST);
        }
    }
}
