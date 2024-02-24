package com.example.tryingspringboot.dto;

import java.util.UUID;

public class TipoDocumentoDTO {

    private UUID IdDocumento;
    private String tipoDocumento;

    public TipoDocumentoDTO() {
    }

    public TipoDocumentoDTO(UUID idDocumento, String tipoDocumento) {
        IdDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public UUID getIdDocumento() {
        return IdDocumento;
    }

    public void setIdDocumento(UUID idDocumento) {
        IdDocumento = idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
