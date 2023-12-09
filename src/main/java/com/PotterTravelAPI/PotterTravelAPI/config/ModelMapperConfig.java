package com.PotterTravelAPI.PotterTravelAPI.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ModelMapperConfig {

    @Bean
    @Lazy
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
