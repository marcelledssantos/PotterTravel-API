package com.PotterTravelAPI.PotterTravelAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name = "viagens")
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private String origem;

    private String destino;

    private LocalDate data;

    private String horario;

    private String ciaAerea;

    private String hotel;


    public Viagem() {
    }

    public Viagem(Long id, Cliente cliente, String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel) {
        this.id = id;
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
    }

    public Viagem(Cliente cliente, String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel) {
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
    }

    public Viagem(String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
    }
}