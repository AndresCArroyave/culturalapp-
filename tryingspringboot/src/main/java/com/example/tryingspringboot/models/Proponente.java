package com.example.tryingspringboot.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "proponente")
public class Proponente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "nombre_proponente", length = 50, nullable = false)
    private String nombre_proponente;
    @Column(name = "trayectoria", length = 60, nullable = false)
    private String trayectoria;
    @ManyToOne
    @JoinColumn(name = "id_representante", referencedColumnName = "id_representante")
    private Representante representante;
    @ManyToOne
    @JoinColumn(name = "id_tipo_proponente", referencedColumnName = "id_tipo_proponente")
    private TipoProponente tipoProponente;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre_proponente() {
        return nombre_proponente;
    }

    public void setNombre_proponente(String nombre_proponente) {
        this.nombre_proponente = nombre_proponente;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public TipoProponente getTipoProponente() {
        return tipoProponente;
    }

    public void setTipoProponente(TipoProponente tipoProponente) {
        this.tipoProponente = tipoProponente;
    }
}
