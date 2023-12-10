package com.PotterTravelAPI.PotterTravelAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name ="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column (unique = true)
    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private Set<Viagem> viagens;
    private String telefone;
    private String email;
    private String senha;


    public Set<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(Set<Viagem> viagens) {
        this.viagens = viagens;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
