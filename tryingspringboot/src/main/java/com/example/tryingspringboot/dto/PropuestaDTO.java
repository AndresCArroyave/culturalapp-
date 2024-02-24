package com.example.tryingspringboot.dto;

import com.example.tryingspringboot.helpers.EstadosPropuesta;
import com.example.tryingspringboot.models.Proponente;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.UUID;

public class PropuestaDTO {


    private UUID idPropuesta;
    private String nombrePropuesta;
    private String descripcionActividad;
    private String descripcionPropuesta;
    private String empresAliada;
    private EstadosPropuesta estadosPropuesta = EstadosPropuesta.INICIO;
    private LocalDate fechaInicio;
    private LocalDate fechaPresentacion;
    private String publicoBeneficiario;
    private Proponente proponente;
    private Integer valorPropuesta;

    public PropuestaDTO() {
    }

    public PropuestaDTO(UUID idPropuesta, String nombrePropuesta, String descripcionActividad, String descripcionPropuesta, String empresAliada, EstadosPropuesta estadosPropuesta, LocalDate fechaInicio, LocalDate fechaPresentacion, String publicoBeneficiario, Proponente proponente, Integer valorPropuesta) {
        this.idPropuesta = idPropuesta;
        this.nombrePropuesta = nombrePropuesta;
        this.descripcionActividad = descripcionActividad;
        this.descripcionPropuesta = descripcionPropuesta;
        this.empresAliada = empresAliada;
        this.estadosPropuesta = estadosPropuesta;
        this.fechaInicio = fechaInicio;
        this.fechaPresentacion = fechaPresentacion;
        this.publicoBeneficiario = publicoBeneficiario;
        this.proponente = proponente;
        this.valorPropuesta = valorPropuesta;
    }

    public UUID getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(UUID idPropuesta) {
        this.idPropuesta = idPropuesta;
    }

    public String getNombrePropuesta() {
        return nombrePropuesta;
    }

    public void setNombrePropuesta(String nombrePropuesta) {
        this.nombrePropuesta = nombrePropuesta;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getDescripcionPropuesta() {
        return descripcionPropuesta;
    }

    public void setDescripcionPropuesta(String descripcionPropuesta) {
        this.descripcionPropuesta = descripcionPropuesta;
    }

    public String getEmpresAliada() {
        return empresAliada;
    }

    public void setEmpresAliada(String empresAliada) {
        this.empresAliada = empresAliada;
    }

    public EstadosPropuesta getEstadosPropuesta() {
        return estadosPropuesta;
    }

    public void setEstadosPropuesta(EstadosPropuesta estadosPropuesta) {
        this.estadosPropuesta = estadosPropuesta;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public String getPublicoBeneficiario() {
        return publicoBeneficiario;
    }

    public void setPublicoBeneficiario(String publicoBeneficiario) {
        this.publicoBeneficiario = publicoBeneficiario;
    }

    public Proponente getProponente() {
        return proponente;
    }

    public void setProponente(Proponente proponente) {
        this.proponente = proponente;
    }

    public Integer getValorPropuesta() {
        return valorPropuesta;
    }

    public void setValorPropuesta(Integer valorPropuesta) {
        this.valorPropuesta = valorPropuesta;
    }
}
