package com.PotterTravelAPI.PotterTravelAPI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;


@Entity
public class Viagem {

    @Getter
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "viagem_name", nullable = false)
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="cliente_id", nullable=false)
    private Cliente cliente;


    private String origem;

    private String destino;

    private String data;

    private String horario;

    private String ciaAerea;

    private String hotel;

    private double valorPacote;

    public double getValorPacote() {
        return valorPacote;
    }

    public void setValorPacote(double valorPacote) {
        this.valorPacote = valorPacote;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    private String formaPagamento;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(String ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}