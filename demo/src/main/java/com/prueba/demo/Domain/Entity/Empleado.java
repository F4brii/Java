package com.prueba.demo.Domain.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    private Long Id;
    private String Nombres;
    private String Apellidos;
    private String Cargo;
    public Long getId() {
        return Id;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String nombres) {
        this.Nombres = nombres;
    }
    public void setId(Long id) {
        this.Id = id;
    }
}
