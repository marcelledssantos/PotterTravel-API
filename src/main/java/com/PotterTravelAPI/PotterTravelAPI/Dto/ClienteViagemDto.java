package com.PotterTravelAPI.PotterTravelAPI.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteViagemDto {

    private Long viagemId;

    private Long clienteId;

}
