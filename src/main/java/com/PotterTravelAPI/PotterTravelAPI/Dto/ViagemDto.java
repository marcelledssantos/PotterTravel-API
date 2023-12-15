package com.PotterTravelAPI.PotterTravelAPI.Dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ViagemDto {

    @JsonIgnore
    private Long id;

    private String origem;

    private String destino;

    private LocalDate data;

    private String horario;

    private String ciaAerea;

    private String hotel;

    private String precoPacote;

    private String formaPagamento;


    public ViagemDto(String origem, String destino, LocalDate data, String horario, String ciaAerea, String hotel, String precoPacote, String formaPagamento) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.ciaAerea = ciaAerea;
        this.hotel = hotel;
        this.precoPacote= precoPacote;
        this.formaPagamento = formaPagamento;

    }

}


