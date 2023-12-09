package com.PotterTravelAPI.PotterTravelAPI.services;

import com.PotterTravelAPI.PotterTravelAPI.DTO.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<ClienteDto> getAllClientesDto();
    Cliente getClienteById(Long id);
    ClienteDto saveCliente(ClienteDto clienteDto);
    Cliente updateCliente(Long id, Cliente clienteUpdated);
    void deleteById(Long id);
}
