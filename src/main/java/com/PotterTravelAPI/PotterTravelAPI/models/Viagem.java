package com.PotterTravelAPI.PotterTravelAPI.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;


@Getter
@Setter
@Entity
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "viagens_clientes",
            joinColumns = @JoinColumn(name = "viagem_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id"))
    private Set<Cliente> clientes = new LinkedHashSet<>();


    private String origem;

    private String destino;

    private LocalDate data;

    private String horario;

    private String ciaAerea;

    private String hotel;

    private String precoPacote;

    private String formaPagamento;


    public Viagem() {
    }

    public Viagem(Long id, String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel, String precoPacote, String formaPagamento) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
        this.precoPacote = precoPacote;
        this.formaPagamento = formaPagamento;

    }

    public Viagem(String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel, String precoPacote, String formaPagamento) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
        this.precoPacote = precoPacote;
        this.formaPagamento = formaPagamento;

    }
}