package com.prueba.demo;

import com.prueba.demo.Context.EmpleadoJPA;
import com.prueba.demo.Infraestructure.Models.EmpleadoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private EmpleadoJPA userRepository;

    @Autowired
    public DataLoader(EmpleadoJPA userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        EmpleadoModel nuevo = new EmpleadoModel();
        nuevo.setNombres("Fabricio");
        nuevo.setApellidos("Caicedom Mosquera");
        nuevo.setCargo("Desarrollador Backend");

        this.userRepository.save(nuevo);        
    }    
}
