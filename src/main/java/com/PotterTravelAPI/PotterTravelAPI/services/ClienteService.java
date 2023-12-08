package com.PotterTravelAPI.PotterTravelAPI.services;

import com.PotterTravelAPI.PotterTravelAPI.entities.Cliente;

import java.util.List;



import com.PotterTravelAPI.PotterTravelAPI.entities.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getAllClientes();
    Cliente getClienteById(Long id);
    Cliente saveCliente(Cliente cliente);
    Cliente updateCliente(Long id, Cliente clienteUpdated);
    void deleteById(Long id);
}
