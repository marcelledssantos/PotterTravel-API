package com.PotterTravelAPI.PotterTravelAPI.servicesImpl;

import com.PotterTravelAPI.PotterTravelAPI.Dto.ClienteDto;

import com.PotterTravelAPI.PotterTravelAPI.models.Cliente;
import com.PotterTravelAPI.PotterTravelAPI.repositories.ClienteRepository;
import com.PotterTravelAPI.PotterTravelAPI.services.ClienteService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class ClienteServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ModelMapper mapper;

    private ClienteDto paraDto(Cliente cliente) {
        return mapper.map(cliente, ClienteDto.class);
    }

    private Cliente paraCliente(ClienteDto clienteDto) {
        return mapper.map(clienteDto, Cliente.class);
    }

    @Override
    public List<ClienteDto> getAllClientesDto() {
        return clienteRepository.findAll().stream()
                .map(this::paraDto)
                .collect(Collectors.toList());
    }

    @Override
    public ClienteDto getClienteById(Long id) {
        return clienteRepository.findById(id)
                .map(this::paraDto)
                .orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado!"));
    }

    @Override
    public ClienteDto saveCliente(ClienteDto clienteDto) {
        Cliente clienteParaSalvar = paraCliente(clienteDto);
        Cliente clienteSalvo = clienteRepository.save(clienteParaSalvar);
        return paraDto(clienteSalvo);
    }

    @Override
    public ClienteDto updateCliente(Long id, ClienteDto clienteDto) {

        Cliente clienteExistente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado!"));
        Cliente clienteParaAtualizar = paraCliente(clienteDto);
        clienteExistente.setNome(clienteParaAtualizar.getNome());
        clienteExistente.setEmail(clienteParaAtualizar.getEmail());
        Cliente clienteAtualizado = clienteRepository.save(clienteExistente);
        return paraDto(clienteAtualizado);
    }

    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}