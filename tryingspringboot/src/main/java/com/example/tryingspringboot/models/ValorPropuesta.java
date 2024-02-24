package com.example.tryingspringboot.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "valor_propuesta")
public class ValorPropuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_valor_propuesta;
    @OneToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    @Column(name = "aporte_comfama")
    private Double aporte_comfama;
    @Column(name = "monto_total_propuesta")
    private Double monto_total_propuesta;
}
