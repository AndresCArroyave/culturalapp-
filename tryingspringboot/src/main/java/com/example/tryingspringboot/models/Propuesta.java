package com.example.tryingspringboot.models;

import com.example.tryingspringboot.helpers.EstadosPropuesta;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "propuesta")
public class Propuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_propuesta;
    @Column(name = "nombre_propuesta", length = 100, nullable = false)
    private String nombre_propuesta;
    @Column(name = "descripcion_actividad", length = 100, nullable = false)
    private String descripcion_actividad;
    @Column(name = "descripcion_propuesta", length = 100, nullable = false)
    private String descripcion_propuesta;
    @Column(name = "empresa_aliada", length = 100, nullable = false)
    private String empresa_aliada;
    @Column(name = "estados_propuesta", nullable = false)
    private EstadosPropuesta estadosPropuesta = EstadosPropuesta.INICIO;
    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fecha_inicio;
    @Column(name = "fecha_presentacion", nullable = false)
    private LocalDate fecha_presentacion;
    @Column(name = "publico_beneficiario", length = 100, nullable = false)
    private String publico_beneficiario;
    @ManyToOne
    @JoinColumn(name = "id_proponente", referencedColumnName = "id_proponente")
    private Proponente proponente;
    @Column(name = "valor_propuesta", nullable = false)
    private Integer valor_propuesta;

    public UUID getId_propuesta() {
        return id_propuesta;
    }

    public void setId_propuesta(UUID id_propuesta) {
        this.id_propuesta = id_propuesta;
    }

    public String getNombre_propuesta() {
        return nombre_propuesta;
    }

    public void setNombre_propuesta(String nombre_propuesta) {
        this.nombre_propuesta = nombre_propuesta;
    }

    public String getDescripcion_actividad() {
        return descripcion_actividad;
    }

    public void setDescripcion_actividad(String descripcion_actividad) {
        this.descripcion_actividad = descripcion_actividad;
    }

    public String getDescripcion_propuesta() {
        return descripcion_propuesta;
    }

    public void setDescripcion_propuesta(String descripcion_propuesta) {
        this.descripcion_propuesta = descripcion_propuesta;
    }

    public String getEmpresa_aliada() {
        return empresa_aliada;
    }

    public void setEmpresa_aliada(String empresa_aliada) {
        this.empresa_aliada = empresa_aliada;
    }

    public EstadosPropuesta getEstadosPropuesta() {
        return estadosPropuesta;
    }

    public void setEstadosPropuesta(EstadosPropuesta estadosPropuesta) {
        this.estadosPropuesta = estadosPropuesta;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_presentacion() {
        return fecha_presentacion;
    }

    public void setFecha_presentacion(LocalDate fecha_presentacion) {
        this.fecha_presentacion = fecha_presentacion;
    }

    public String getPublico_beneficiario() {
        return publico_beneficiario;
    }

    public void setPublico_beneficiario(String publico_beneficiario) {
        this.publico_beneficiario = publico_beneficiario;
    }

    public Proponente getProponente() {
        return proponente;
    }

    public void setProponente(Proponente proponente) {
        this.proponente = proponente;
    }

    public Integer getValor_propuesta() {
        return valor_propuesta;
    }

    public void setValor_propuesta(Integer valor_propuesta) {
        this.valor_propuesta = valor_propuesta;
    }
}
