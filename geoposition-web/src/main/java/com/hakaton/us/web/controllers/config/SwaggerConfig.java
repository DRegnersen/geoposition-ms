package com.hakaton.us.web.controllers.config;


import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springDemoOpenAPI() {
        return new OpenAPI();
    }
    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("geoposition-ms")
                .pathsToMatch("/likes/**")
                .build();
    }
}

