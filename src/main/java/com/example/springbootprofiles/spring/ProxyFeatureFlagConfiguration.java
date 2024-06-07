package com.example.springbootprofiles.spring;


import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("environment")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProxyFeatureFlagConfiguration {

    public ProxyFeatureFlagConfiguration() {

    }

    public String name;

    public boolean enabled;

    public String proxyAddress;
}
