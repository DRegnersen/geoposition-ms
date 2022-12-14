package com.hakaton.us.repo.app;


import com.hakaton.us.web.controllers.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(WebConfig.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}

