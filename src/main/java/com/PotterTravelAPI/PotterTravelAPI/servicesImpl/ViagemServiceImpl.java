package com.PotterTravelAPI.PotterTravelAPI.servicesImpl;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.Dto.ViagemDto;
import com.PotterTravelAPI.PotterTravelAPI.config.ModelMapperConfig;
import com.PotterTravelAPI.PotterTravelAPI.models.Cliente;
import com.PotterTravelAPI.PotterTravelAPI.models.Viagem;
import com.PotterTravelAPI.PotterTravelAPI.repositories.ViagemRepository;
import com.PotterTravelAPI.PotterTravelAPI.services.ViagemService;
import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemServiceImpl implements ViagemService {


    @Autowired
    private ViagemRepository viagemRepository;

    @Autowired
    private ModelMapper mapper;

    private ViagemDto paraDto(Viagem viagem) {
        return mapper.map(viagem, ViagemDto.class);
    }

    private Viagem paraViagem(ViagemDto viagemDto) {
        return mapper.map(viagemDto, Viagem.class);
    }

    @Override
    public List<Viagem> getAllViagens() {
        return viagemRepository.findAll();
    }

    @Override
    public ViagemDto getViagemById(Long id) {
        return viagemRepository.findById(id)
                .map(this::paraDto)
                .orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado!"));
    }

    @Override
    public ViagemDto saveViagem(ViagemDto viagemDto) {
        Viagem viagemParaSalvar = paraViagem(viagemDto);
        Viagem viagemSalva = viagemRepository.save(viagemParaSalvar);
        return paraDto(viagemSalva);
    }

    @Override
    public Viagem updateViagem(Long id, Viagem viagemUpdated) {
        return null;
    }

    /*@Override
    public Viagem updateViagem(Long id, Viagem viagemUpdated) {
        Viagem viagemCadastrada = getViagemById(id);
        return viagemRepository.save(viagemCadastrada);
    }*/

    @Override
    public void deleteById(Long id) {
        viagemRepository.deleteById(id);
    }

}
