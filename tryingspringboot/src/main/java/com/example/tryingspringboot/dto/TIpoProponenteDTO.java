package com.example.tryingspringboot.dto;

import java.util.UUID;

public class TIpoProponenteDTO {

    private UUID idProponente;
    private String tipoProponente;

    public TIpoProponenteDTO() {
    }

    public TIpoProponenteDTO(UUID idProponente, String tipoProponente) {
        this.idProponente = idProponente;
        this.tipoProponente = tipoProponente;
    }

    public UUID getIdProponente() {
        return idProponente;
    }

    public void setIdProponente(UUID idProponente) {
        this.idProponente = idProponente;
    }

    public String getTipoProponente() {
        return tipoProponente;
    }

    public void setTipoProponente(String tipoProponente) {
        this.tipoProponente = tipoProponente;
    }
}
