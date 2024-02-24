package com.example.tryingspringboot.dto;

public class ValorPropuestaDTO {

    private Double aporteComfama;
    private Double montoTotalPropuesta;

    public ValorPropuestaDTO() {
    }

    public ValorPropuestaDTO(Double aporteComfama, Double montoTotalPropuesta) {
        this.aporteComfama = aporteComfama;
        this.montoTotalPropuesta = montoTotalPropuesta;
    }

    public Double getAporteComfama() {
        return aporteComfama;
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
