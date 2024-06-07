package com.example.springbootprofiles.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.springbootprofiles.model.JWTConsumerKeys;
import org.springframework.core.env.Environment;

@Configuration
public class JWTConsumerKeysConfig {


    @Bean
    public JWTConsumerKeys JWTConsumer()
    {
        final JWTConsumerKeys jwtConsumerKeys = new JWTConsumerKeys();
        jwtConsumerKeys.ApiKey = System.getenv("JWT_API_KEY");
        jwtConsumerKeys.ConsumerCert = System.getenv("JWT_CONSUMER_CERT");
        jwtConsumerKeys.SecretKey = System.getenv("JWT_SECRET_KEY");
        return jwtConsumerKeys;
    }
}
