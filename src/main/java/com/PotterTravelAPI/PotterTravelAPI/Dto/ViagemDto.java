package com.PotterTravelAPI.PotterTravelAPI.Dto;

import com.PotterTravelAPI.PotterTravelAPI.entities.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ViagemDto {

    private Long id;
    private Cliente cliente;

    private String origem;

    private String destino;

    private LocalDate data;

    private LocalDateTime horario;

    private String ciaAerea;

    private String hotel;

    public ViagemDto(Long id, Cliente cliente, String origem, String destino,
                     LocalDate data, LocalDateTime horario, String ciaAerea, String hotel) {
        this.id = id;
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
    }

    public ViagemDto(Cliente cliente, String origem, String destino, LocalDate data, LocalDateTime horario,
                     String ciaAerea, String hotel) {
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
    }
}
