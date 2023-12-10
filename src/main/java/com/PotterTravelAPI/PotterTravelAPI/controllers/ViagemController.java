package com.PotterTravelAPI.PotterTravelAPI.controllers;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.Dto.ViagemDto;
import com.PotterTravelAPI.PotterTravelAPI.models.Viagem;
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
    public ViagemDto createViagem(@RequestBody ViagemDto viagemDto) {
        return viagemService.saveViagem(viagemDto);
    }

    @GetMapping()
    public List<ViagemDto> getAllViagem() {
        return viagemService.getAllViagensDto();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ViagemDto> getViagemById(@PathVariable Long id) {
        ViagemDto viagemDto = viagemService.getViagemById(id);
        return ResponseEntity.ok(viagemDto);
    }

    /*@PutMapping("/{id}")
    public ResponseEntity<Viagem> updateViagem(@PathVariable Long id, @RequestBody Viagem viagemUpdated) {
       Viagem viagem = viagemService.getViagemById(id);
        viagem.setId(viagemUpdated.getId());
        viagemService.saveViagem(viagem);
        return ResponseEntity.ok(viagem);
    }*/

    @DeleteMapping("/{id}")
    public void deleteViagem(@PathVariable Long id) {
        viagemService.deleteById(id);
    }
}


