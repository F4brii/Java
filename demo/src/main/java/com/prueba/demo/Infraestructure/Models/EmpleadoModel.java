package com.prueba.demo.Infraestructure.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

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
@Entity
@Table(name = "empleado")
public class EmpleadoModel {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(length = 100, name = "nombres", nullable = false)
    private String Nombres;
    @Column(length = 100, name = "apellidos", nullable = false)
    private String Apellidos;
    @Column(length = 100, name = "cargo", nullable = false)
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
