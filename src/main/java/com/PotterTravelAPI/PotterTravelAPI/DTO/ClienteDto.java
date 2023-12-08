package com.PotterTravelAPI.PotterTravelAPI.DTO;

import org.springframework.stereotype.Component;

@Component
public class ClienteDto {

    private Long clienteId;

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}
