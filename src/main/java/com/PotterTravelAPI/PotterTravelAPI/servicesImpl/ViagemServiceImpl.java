package com.PotterTravelAPI.PotterTravelAPI.servicesImpl;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ViagemDto;
import com.PotterTravelAPI.PotterTravelAPI.models.Cliente;
import com.PotterTravelAPI.PotterTravelAPI.models.Viagem;
import com.PotterTravelAPI.PotterTravelAPI.repositories.ClienteRepository;
import com.PotterTravelAPI.PotterTravelAPI.repositories.ViagemRepository;
import com.PotterTravelAPI.PotterTravelAPI.services.ViagemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ViagemServiceImpl implements ViagemService {


    @Autowired
    private ViagemRepository viagemRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ModelMapper mapper;


    private ViagemDto paraDto(Viagem viagem) {
        return mapper.map(viagem, ViagemDto.class);
    }

    private Viagem paraViagem(ViagemDto viagemDto) {
        return mapper.map(viagemDto, Viagem.class);
    }


    @Override
    public List<ViagemDto> getAllViagensDto() {
        return viagemRepository.findAll().stream()
                .map(this::paraDto)
                .collect(Collectors.toList());
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
    public ViagemDto updateViagem(Long id, ViagemDto viagemDto) {
        Viagem viagemExistente = viagemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado!"));
        Viagem viagemParaAtualizar = paraViagem(viagemDto);
        viagemExistente.setData(viagemParaAtualizar.getData());
        viagemExistente.setHorario(viagemParaAtualizar.getHorario());

        Viagem viagemAtualizada = viagemRepository.save(viagemExistente);
        return paraDto(viagemAtualizada);
    }

    @Override
    public void deleteById(Long id) {
        viagemRepository.deleteById(id);
    }

    @Override
    public void comprarPacote(Long viagemId, Long clienteId) {

        Viagem viagem = viagemRepository.findById(viagemId).orElseThrow(() -> new RuntimeException("ID: " + viagemId + "Não encontrado!"));
        Cliente cliente = clienteRepository.findById(clienteId).orElseThrow(() -> new RuntimeException("ID: " + clienteId + "Não encontrado!"));

        if (viagem != null && cliente != null) {
            viagem.getClientes().add(cliente);
            cliente.getViagem().add(viagem);
            viagemRepository.save(viagem);
            clienteRepository.save(cliente);
        }
    }
}
