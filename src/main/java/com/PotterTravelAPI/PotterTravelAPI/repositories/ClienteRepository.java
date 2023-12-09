package com.PotterTravelAPI.PotterTravelAPI.repositories;

import com.PotterTravelAPI.PotterTravelAPI.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
