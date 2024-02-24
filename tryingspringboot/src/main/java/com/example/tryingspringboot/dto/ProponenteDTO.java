package com.example.tryingspringboot.dto;

public class ProponenteDTO {
    private String nombreProponente;
    private String trayectoria;
    private String tipo_proponente;
    private String nombreRepresentante;
    public ProponenteDTO() {
    }

    public ProponenteDTO(String nombreProponente, String trayectoria, String tipo_proponente, String nombreRepresentante) {
        this.nombreProponente = nombreProponente;
        this.trayectoria = trayectoria;
        this.tipo_proponente = tipo_proponente;
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getNombreProponente() {
        return nombreProponente;
    }

    public void setNombreProponente(String nombreProponente) {
        this.nombreProponente = nombreProponente;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }

    public String getTipo_proponente() {
        return tipo_proponente;
    }

    public void setTipo_proponente(String tipo_proponente) {
        this.tipo_proponente = tipo_proponente;
    }
}
