package com.todocode.libros.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean("apiConsumir")
    public RestTemplate registraRestTemplate(){
        return new RestTemplate();
    }
}
