package com.PotterTravelAPI.PotterTravelAPI.controllers;

import com.PotterTravelAPI.PotterTravelAPI.DTO.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.model.Cliente;
import com.PotterTravelAPI.PotterTravelAPI.services.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Clientes", description = "CRUD")
@RestController
@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping()
    public ClienteDto createCliente(@RequestBody ClienteDto clienteDto) {
        return clienteService.saveCliente(clienteDto);
    }

    @GetMapping()
    public List<ClienteDto> getAllClientes() {
        return clienteService.getAllClientesDto();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = clienteService.getClienteById(id);

        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody ClienteDto clienteUpdated) {
        Cliente cliente = clienteService.getClienteById(id);

        //cliente.setNome(clienteUpdated.getNome());

        //clienteService.saveCliente(clienteDto);

        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
}

