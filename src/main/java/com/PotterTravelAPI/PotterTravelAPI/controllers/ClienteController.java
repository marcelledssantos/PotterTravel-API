package com.PotterTravelAPI.PotterTravelAPI.controllers;

import com.PotterTravelAPI.PotterTravelAPI.DTO.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.model.Cliente;
import com.PotterTravelAPI.PotterTravelAPI.services.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Clientes", description = "CRUD")
@RestController
@RequestMapping("/clientes")

public class ClienteController {

    private ClienteService clienteService;

    @PostMapping("/save")
    public ClienteDto createCliente(@RequestBody ClienteDto clienteDto) {
        return clienteService.saveCliente(clienteDto);
    }

    @GetMapping("/all")
    public List<Cliente> getAllClientes() {

        return clienteService.getAllClientes();
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
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteById(id);
    }

    @Autowired
    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

}

