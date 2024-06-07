package com.example.springbootprofiles;

import com.example.springbootprofiles.model.JWTConsumerKeys;
import com.example.springbootprofiles.spring.JWTConsumerKeysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.springbootprofiles.spring.ProxyFeatureFlagConfiguration;


@SpringBootApplication
public class SpringbootprofilesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootprofilesApplication.class, args);
    }

    @Autowired
    public ProxyFeatureFlagConfiguration proxyFeatureFlagConfiguration;

    @Autowired
    public JWTConsumerKeys jwtConsumerKeys;

    @Override
    public void run(String... args) {
        //Profile Configuration injected as a Component & ConfigurationProperties
        System.out.print(proxyFeatureFlagConfiguration.name);
        System.out.println(proxyFeatureFlagConfiguration.enabled);
        System.out.println(proxyFeatureFlagConfiguration.proxyAddress);
        //Environment Config Injected as a Bean -- Could be defined in Container OS (or) local OS
        System.out.print(jwtConsumerKeys.getApiKey());
        System.out.print(jwtConsumerKeys.getSecretKey());
        System.out.print(jwtConsumerKeys.getConsumerCert());
    }
}
