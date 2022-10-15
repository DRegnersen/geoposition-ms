package com.hakaton.us.service.config;


import com.hakaton.us.repo.config.RepoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Configuration
@ComponentScan(basePackages = {"com.hakaton.us.service.services.impl", "com.hakaton.us.service.utils"})
@Import({RepoConfig.class})
public class ServiceConfig {
}
