package com.example.tryingspringboot.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "representante")
public class Representante {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_representante;
    @Column(name = "correo_electronico", length = 100, nullable = false)
    private String correo_electronico;
    @Column(name = "numero_documento", length = 100, nullable = false)
    private String numero_documento;
    @Column(name = "primer_apellido", length = 100, nullable = false)
    private String primer_apellido;
    @Column(name = "primer_nombre", length = 100, nullable = false)
    private String primer_nombre;
    @Column(name = "telefono_celular", length = 100, nullable = false)
    private String telefono_celular;
    @Column(name = "telefono_fijo", length = 100, nullable = false)
    private String telefono_fijo;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumento;

    public UUID getId_representante() {
        return id_representante;
    }

    public void setId_representante(UUID id_representante) {
        this.id_representante = id_representante;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
