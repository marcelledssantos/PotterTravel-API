package com.PotterTravelAPI.PotterTravelAPI.repositories;

import com.PotterTravelAPI.PotterTravelAPI.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
