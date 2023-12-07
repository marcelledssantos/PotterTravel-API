package com.PotterTravelAPI.PotterTravelAPI.Dto;

import com.PotterTravelAPI.PotterTravelAPI.entities.Viagem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.Set;

public class ClienteDto {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;

    private  Viagem viagem;

    public ClienteDto() {
    }


    public ClienteDto(Long id, String nome, String cpf, String telefone, String email, String senha, Viagem viagem) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.viagem = viagem;
    }
    public ClienteDto(String nome, String cpf, String telefone, String email, String senha, Viagem viagem) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.viagem = viagem;
    }
}
