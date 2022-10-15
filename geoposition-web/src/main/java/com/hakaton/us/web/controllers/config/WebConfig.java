package com.hakaton.us.web.controllers.config;

import com.hakaton.us.service.config.ServiceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = {"com.hakaton.us.web.controllers.config.controllers"})
@Import({ServiceConfig.class, SwaggerConfig.class})
public class WebConfig implements WebMvcConfigurer {
}

