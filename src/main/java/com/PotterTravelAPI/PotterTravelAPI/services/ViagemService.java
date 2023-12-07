package com.PotterTravelAPI.PotterTravelAPI.services;

import com.PotterTravelAPI.PotterTravelAPI.entities.Viagem;

import java.util.List;

public interface ViagemService {

    List<Viagem> getAllViagens();

    Viagem getViagemById(Long id);

    Viagem saveViagem(Viagem viagem);

    Viagem updateViagem(Long id, Viagem viagemUpdated);

    void deleteById(Long id);

}