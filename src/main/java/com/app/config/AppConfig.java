package com.app.config;

import com.app.util.Common;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.text.DecimalFormat;
import java.util.Random;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton")
    public ModelMapper modelmapper() {
        return new ModelMapper();
    }

    @Bean
    @Scope("singleton")
    public Random random() {
        return new Random();
    }

    @Bean
    @Scope("singleton")
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    @Scope("singleton")
    public DecimalFormat decimalFormat() {
        return new DecimalFormat("##,###");
    }

    @Bean
    @Scope("singleton")
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }




}
