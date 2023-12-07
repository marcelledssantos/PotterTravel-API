package com.PotterTravelAPI.PotterTravelAPI.Mapper;


import com.PotterTravelAPI.PotterTravelAPI.Dto.ClienteDto;
import com.PotterTravelAPI.PotterTravelAPI.entities.Cliente;
import org.modelmapper.ModelMapper;

public class ClienteMapper {
    private static  final ModelMapper modelMapper = new ModelMapper();

    public static ClienteDto toDto(Cliente cliente) {
        return modelMapper.map(cliente, ClienteDto.class);
    }
        public static  Cliente toEntity(ClienteDto clienteDto) {
            return modelMapper.map(clienteDto, Cliente.class);
        }
    }

