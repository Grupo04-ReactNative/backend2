package com.tinytale.sensedetect.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry) {
        registry.addMapping("/**")
                // to accept cors requests from frontend prototype
                .allowedOrigins("http://192.168.18.4:8081")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
