package com.example.tryingspringboot.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tipos_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_tipo_documento;
    @Column(name = "tipo_documento")
    private String tipo_documento;

    public UUID getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(UUID id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
}
