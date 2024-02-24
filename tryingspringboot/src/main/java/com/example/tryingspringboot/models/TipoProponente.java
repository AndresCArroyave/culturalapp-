package com.example.tryingspringboot.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tipos_proponente")
public class TipoProponente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_tipo_proponente;
    @Column(name = "tipo_proponente")
    private String tipo_proponente;

    public UUID getId_tipo_proponente() {
        return id_tipo_proponente;
    }

    public void setId_tipo_proponente(UUID id_tipo_proponente) {
        this.id_tipo_proponente = id_tipo_proponente;
    }

    public String getTipo_proponente() {
        return tipo_proponente;
    }

    public void setTipo_proponente(String tipo_proponente) {
        this.tipo_proponente = tipo_proponente;
    }
}
