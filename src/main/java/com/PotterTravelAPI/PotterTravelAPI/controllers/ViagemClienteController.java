package com.PotterTravelAPI.PotterTravelAPI.controllers;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ClienteViagemDto;
import com.PotterTravelAPI.PotterTravelAPI.services.ViagemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "ConfirmaçãoCompra")
@RequestMapping()
public class ViagemClienteController {

    @Autowired
    private ViagemService viagemService;

    @PostMapping("/comprar")
    public ResponseEntity<String> comprarPacote(@RequestBody ClienteViagemDto clienteViagemDTO) {
        viagemService.comprarPacote(clienteViagemDTO.getViagemId(), clienteViagemDTO.getClienteId());

        return new ResponseEntity<>("Compra realizada com sucesso!", HttpStatus.OK);
    }

}

