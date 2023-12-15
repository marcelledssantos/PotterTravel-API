package com.PotterTravelAPI.PotterTravelAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    @Column(unique = true)
    private String cpf;

    @JsonIgnore
    @ManyToMany(mappedBy = "clientes", fetch = FetchType.EAGER)
    private Set<Viagem> viagem = new HashSet<>();
    private String telefone;
    private String email;
    private String senha;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpf, String telefone, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
}
