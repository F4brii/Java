package com.prueba.demo.Infraestructure.Models;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
@Table(name = "actividad")
@NamedQuery(name = "ActividadModel.findAllEmpleado",
        query = "SELECT c FROM ActividadModel c Where c.IdEmpleado = :id")
public class ActividadModel {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(length = 100, name = "nombre", nullable = false)
    private String Nombre;
    @Column(name = "tiempo", nullable = false)
    private int Tiempo;
    @Column(name = "fecha", nullable = false)
    private Date FechaRegistro;
    @Column(name = "id_empleado", nullable = false)
    private Long IdEmpleado;

    @ManyToOne
    private EmpleadoModel EmpleadoPadre;

    public EmpleadoModel getEmpleado() {
        return EmpleadoPadre;
    }

    public void setEmpleado(EmpleadoModel empleado) {
        this.EmpleadoPadre = empleado;
    }

    public Long getId() {
        return Id;
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

    public Long getIdEmpleado() {
        return this.IdEmpleado;
    }

    public void setIdEmpleado(Long id) {
        this.IdEmpleado = id;
    }

}
