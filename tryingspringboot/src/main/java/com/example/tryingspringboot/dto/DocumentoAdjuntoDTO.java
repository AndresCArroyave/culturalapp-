package com.example.tryingspringboot.dto;

public class DocumentoAdjuntoDTO {

    private String nombreDocumento;
    private String enlace;

    public DocumentoAdjuntoDTO() {
    }

    public DocumentoAdjuntoDTO(String nombreDocumento, String enlace) {
        this.nombreDocumento = nombreDocumento;
        this.enlace = enlace;
    }

    public String getNombre() {
        return nombreDocumento;
    }

    public void setNombre(String nombre) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
