package com.PotterTravelAPI.PotterTravelAPI.services;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ViagemDto;
import com.PotterTravelAPI.PotterTravelAPI.models.Viagem;

import java.util.List;

public interface ViagemService {

    List<Viagem> getAllViagens();

    Viagem getViagemById(Long id);

    ViagemDto saveViagem(ViagemDto viagemDto);

    Viagem updateViagem(Long id, Viagem viagemUpdated);

    void deleteById(Long id);

}