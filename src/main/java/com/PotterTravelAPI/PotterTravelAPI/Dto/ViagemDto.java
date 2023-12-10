package com.PotterTravelAPI.PotterTravelAPI.Dto;



import com.PotterTravelAPI.PotterTravelAPI.models.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;

public class ViagemDto {

    @JsonIgnore
    private Long id;
    private Cliente cliente;

    private String origem;

    private String destino;

    private LocalDate data;

    private String horario;

    private String ciaAerea;

    private String hotel;

    public ViagemDto() {
    }

    public ViagemDto(Long id, String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
    }

    public ViagemDto(Cliente cliente, String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel) {
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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


