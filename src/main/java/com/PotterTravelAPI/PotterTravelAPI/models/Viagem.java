package com.PotterTravelAPI.PotterTravelAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


@Getter
@Setter
@Entity
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   /* @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="cliente_viagem",
    joinColumns = @JoinColumn(name = "viagem_id"),
    inverseJoinColumns=@JoinColumn(name="cliente_id"))
    private Set<Cliente> students = new HashSet<>();*/


    private String origem;

    private String destino;

    private LocalDate data;

    private String horario;

    private String ciaAerea;

    private String hotel;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "viagens_clientes",
            joinColumns = @JoinColumn(name = "viagem_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id"))
    private Set<Cliente> clientes = new LinkedHashSet<>();


    public Viagem() {
    }

    public Viagem(Long id, String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel) {
        this.id = id;
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