package com.PotterTravelAPI.PotterTravelAPI.servicesImpl;

import com.PotterTravelAPI.PotterTravelAPI.DTO.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.model.Cliente;
import com.PotterTravelAPI.PotterTravelAPI.repositories.ClienteRepository;
import com.PotterTravelAPI.PotterTravelAPI.services.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado!"));
    }

    @Override
    public ClienteDto saveCliente(ClienteDto clienteDto) {
        Cliente clienteParaSalvar = paraCliente(clienteDto);
        Cliente clienteSalvo = clienteRepository.save(clienteParaSalvar);
        return paraDto(clienteSalvo);
    }

    @Override
    public Cliente updateCliente(Long id, Cliente clienteUpdated) {
        Cliente clienteCadastrado = getClienteById(id);
        clienteCadastrado.setNome(clienteUpdated.getNome());
        return clienteRepository.save(clienteCadastrado);
    }

    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}