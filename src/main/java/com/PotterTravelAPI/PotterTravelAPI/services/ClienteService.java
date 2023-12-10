package com.PotterTravelAPI.PotterTravelAPI.services;

import com.PotterTravelAPI.PotterTravelAPI.DTO.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<ClienteDto> getAllClientesDto();
    ClienteDto getClienteById(Long id);
    ClienteDto saveCliente(ClienteDto clienteDto);
    ClienteDto updateCliente(Long id, ClienteDto clienteDtoUpdated);
    void deleteById(Long id);
}
