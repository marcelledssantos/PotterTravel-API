package com.PotterTravelAPI.PotterTravelAPI.repositories;

import com.PotterTravelAPI.PotterTravelAPI.entities.Viagem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

    @Transactional
    @Modifying
    @Query(nativeQuery= true, value= "INSERT INTO viagem_cliente (viagem_id, cliente_id) VALUES (:viagemId, :clienteId)")
    void addRelationship(@Param("clienteId") Long viagemId, @Param("viagemId") Long clienteId);
}
