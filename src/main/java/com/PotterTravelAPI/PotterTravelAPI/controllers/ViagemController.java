package com.PotterTravelAPI.PotterTravelAPI.controllers;

import com.PotterTravelAPI.PotterTravelAPI.model.Viagem;
import com.PotterTravelAPI.PotterTravelAPI.services.ViagemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Viagens", description = "CRUD")
@RestController
@RequestMapping("/viagens")
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @Autowired
    private ModelMapper modelMapper;
    @PostMapping("/save")
    public Viagem createViagem(@RequestBody Viagem viagem) {
        return viagemService.saveViagem(viagem);
    }

    @GetMapping("/all")
    public List<Viagem> getAllViagem() {
        return viagemService.getAllViagens();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Viagem> getViagemById(@PathVariable Long id) {
       Viagem viagem = viagemService.getViagemById(id);
        return ResponseEntity.ok(viagem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Viagem> updateViagem(@PathVariable Long id, @RequestBody Viagem viagemUpdated) {
       Viagem viagem = viagemService.getViagemById(id);
        viagem.setId(viagemUpdated.getId());
        viagemService.saveViagem(viagem);
        return ResponseEntity.ok(viagem);
    }

    @DeleteMapping("/{id}")
    public void deleteViagem(@PathVariable Long id) {
        viagemService.deleteById(id);
    }
}


