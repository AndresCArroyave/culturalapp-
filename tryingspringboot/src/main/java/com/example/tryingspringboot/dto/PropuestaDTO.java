package com.example.tryingspringboot.dto;

import com.example.tryingspringboot.helpers.EstadosPropuesta;

import java.time.LocalDate;

public class PropuestaDTO {


    private String nombreProponente;
    private String descripcion;
    private String descripcionActividad;
    private LocalDate fechaPresentacion;
    private LocalDate fechaInicioEvento;
    private String estadoPropuesta;

    public PropuestaDTO() {
    }

    public PropuestaDTO(String nombreProponente, String descripcion, String descripcionActividad, LocalDate fechaPresentacion, LocalDate fechaInicioEvento, String estadoPropuesta) {
        this.nombreProponente = nombreProponente;
        this.descripcion = descripcion;
        this.descripcionActividad = descripcionActividad;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaInicioEvento = fechaInicioEvento;
        this.estadoPropuesta = estadoPropuesta;
    }

    public String getNombreProponente() {
        return nombreProponente;
    }

    public void setNombreProponente(String nombreProponente) {
        this.nombreProponente = nombreProponente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public LocalDate getFechaInicioEvento() {
        return fechaInicioEvento;
    }

    public void setFechaInicioEvento(LocalDate fechaInicioEvento) {
        this.fechaInicioEvento = fechaInicioEvento;
    }

    public String getEstadoPropuesta() {
        return estadoPropuesta;
    }

    public void setEstadoPropuesta(String estadoPropuesta) {
        this.estadoPropuesta = estadoPropuesta;
    }
}
