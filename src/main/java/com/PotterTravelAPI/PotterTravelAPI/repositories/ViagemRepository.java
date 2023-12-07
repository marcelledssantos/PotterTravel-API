package com.PotterTravelAPI.PotterTravelAPI.repositories;

import com.PotterTravelAPI.PotterTravelAPI.entities.Viagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
