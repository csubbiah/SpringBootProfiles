package com.example.springbootprofiles;

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

    @Override
    public void run(String... args) {
        System.out.print(proxyFeatureFlagConfiguration.name);
        System.out.println(proxyFeatureFlagConfiguration.enabled);
        System.out.println(proxyFeatureFlagConfiguration.proxyAddress);
    }
}
