package com.PotterTravelAPI.PotterTravelAPI.services;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ViagemDto;
import com.PotterTravelAPI.PotterTravelAPI.models.Viagem;

import java.util.List;

public interface ViagemService {

    List<ViagemDto> getAllViagensDto();

    ViagemDto getViagemById(Long id);

    ViagemDto saveViagem(ViagemDto viagemDto);

    Viagem updateViagem(Long id, Viagem viagemUpdated);

    void deleteById(Long id);

}