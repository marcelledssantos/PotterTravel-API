package com.PotterTravelAPI.PotterTravelAPI.controllers;

import com.PotterTravelAPI.PotterTravelAPI.entities.Viagem;
import com.PotterTravelAPI.PotterTravelAPI.services.ViagemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Viagens", description = "CRUD")
@RestController
@RequestMapping("/viagens")
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @PostMapping("/save")
    public Viagem createViagem(@RequestBody Viagem viagem) {
        return viagemService.saveViagem(viagem);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Viagem> getViagemById(@PathVariable Long id) {
       Viagem viagem = viagemService.getViagemById(id);

        return ResponseEntity.ok(viagem);
    }
}


