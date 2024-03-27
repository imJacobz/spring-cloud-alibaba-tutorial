package com.jacobz.nxauto.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Retryer retryer(){
        return new Retryer.Default(100, 1,3);
    }

    /**
     * enable log function
     * @return Logger.Level
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

