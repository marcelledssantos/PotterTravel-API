package com.PotterTravelAPI.PotterTravelAPI.controllers;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.services.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Cliente", description = "CRUD")
@RestController
@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping()
    public ResponseEntity<ClienteDto> createCliente(@RequestBody ClienteDto clienteDto) {
         ClienteDto clienteSalvo = clienteService.saveCliente(clienteDto);
        return ResponseEntity.ok(clienteSalvo);
    }

    @GetMapping()
    public List<ClienteDto> getAllClientes() {
        return clienteService.getAllClientesDto();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> getClienteById(@PathVariable Long id) {
        ClienteDto clienteDto = clienteService.getClienteById(id);
        return ResponseEntity.ok(clienteDto);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ClienteDto> updateCliente(@PathVariable Long id, @RequestBody ClienteDto clienteDto) {
        ClienteDto clienteAtualizado = clienteService.updateCliente(id, clienteDto);
        return new ResponseEntity<>(clienteAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
}

