package com.example.tryingspringboot.dto;

import com.example.tryingspringboot.models.Propuesta;

import java.util.UUID;

public class ValorPropuestaDTO {

    private UUID idValorPropuesta;
    private Propuesta propuesta;
    private Double aporteComfama;
    private Double montoTotalPropuesta;

    public ValorPropuestaDTO() {
    }

    public ValorPropuestaDTO(UUID idValorPropuesta, Propuesta propuesta, Double aporteComfama, Double montoTotalPropuesta) {
        this.idValorPropuesta = idValorPropuesta;
        this.propuesta = propuesta;
        this.aporteComfama = aporteComfama;
        this.montoTotalPropuesta = montoTotalPropuesta;
    }

    public Double getAporteComfama() {
        return aporteComfama;
    }

    public UUID getIdValorPropuesta() {
        return idValorPropuesta;
    }

    public void setIdValorPropuesta(UUID idValorPropuesta) {
        this.idValorPropuesta = idValorPropuesta;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public void setAporteComfama(Double aporteComfama) {
        this.aporteComfama = aporteComfama;
    }

    public Double getMontoTotalPropuesta() {
        return montoTotalPropuesta;
    }

    public void setMontoTotalPropuesta(Double montoTotalPropuesta) {
        this.montoTotalPropuesta = montoTotalPropuesta;
    }
}
