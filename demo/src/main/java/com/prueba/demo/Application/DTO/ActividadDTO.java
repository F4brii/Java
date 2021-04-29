package com.prueba.demo.Application.DTO;

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
public class ActividadDTO {
    private Long Id;
    private String Nombre;
    private int Tiempo;
    private Date FechaRegistro;
    private Long IdEmpleado;

    private EmpleadoDTO EmpleadoPadre;

    public Long getId() {
        return Id;
    }

    public EmpleadoDTO getEmpleado() {
        return EmpleadoPadre;
    }

    public void setEmpleado(EmpleadoDTO empleado) {
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
