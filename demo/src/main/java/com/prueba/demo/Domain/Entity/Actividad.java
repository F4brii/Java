package com.prueba.demo.Domain.Entity;

import java.util.Date;

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
public class Actividad {
    private Long Id;
    private String Nombre;
    private int Tiempo;
    private Date FechaRegistro;
    private Long IdEmpleado;

    private Empleado EmpleadoPadre;

    public Long getId() {
        return Id;
    }

    public Empleado getEmpleado() {
        return EmpleadoPadre;
    }

    public void setEmpleado(Empleado empleado) {
        this.EmpleadoPadre = empleado;
    }

    public Long getIdEmpleado() {
        return IdEmpleado;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.FechaRegistro = fechaRegistro;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int tiempo) {
        this.Tiempo = tiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public void setIdEmpleado(Long id) {
        this.IdEmpleado = id;
    }
}
