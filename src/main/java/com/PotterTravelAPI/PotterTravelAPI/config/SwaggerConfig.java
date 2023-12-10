package com.PotterTravelAPI.PotterTravelAPI.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("REST API - Potter Travel")
                                .description("Agência de viagem desenvolvida para o bootcamp RecodePro")
                                .version("v1")
                                .contact(new Contact().name("Marcelle Santos").email("marcelle@gmail.com"))
                );

    }
}
