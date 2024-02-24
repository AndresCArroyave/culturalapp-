package com.example.tryingspringboot.models;

import com.example.tryingspringboot.models.keys.DocumentoAdjuntoPropuestaPK;
import jakarta.persistence.*;


@Entity
@Table(name = "propuesta_documento")
@IdClass(DocumentoAdjuntoPropuestaPK.class)
public class DocumentoAdjuntoPropuesta {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    @Id
    @ManyToOne
    @JoinColumn(name = "id_documentoAdjunto", referencedColumnName = "id_documentoAdjunto")
    private DocumentoAdjuntoPropuesta documentoAdjuntoPropuesta;

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public DocumentoAdjuntoPropuesta getDocumentoAdjunto() {
        return documentoAdjuntoPropuesta;
    }

    public void setDocumentoAdjunto(DocumentoAdjuntoPropuesta documentoAdjuntoPropuesta) {
        this.documentoAdjuntoPropuesta = documentoAdjuntoPropuesta;
    }
}
