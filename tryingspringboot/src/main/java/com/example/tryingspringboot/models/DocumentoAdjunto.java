package com.example.tryingspringboot.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "documentos_adjuntos")
public class DocumentoAdjunto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_documento_adjunto;
    @Column(name = "nombre_documento")
    private String nombre_documento;
    @Column(name = "url")
    private String URL;

    public UUID getId_documento_adjunto() {
        return id_documento_adjunto;
    }

    public void setId_documento_adjunto(UUID id_documento_adjunto) {
        this.id_documento_adjunto = id_documento_adjunto;
    }

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) {
        this.nombre_documento = nombre_documento;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
