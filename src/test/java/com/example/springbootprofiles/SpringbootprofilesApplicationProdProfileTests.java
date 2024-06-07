package com.example.springbootprofiles;

import static org.junit.jupiter.api.Assertions.*;
import com.example.springbootprofiles.spring.ProxyFeatureFlagConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@ActiveProfiles("prod")
class SpringbootprofilesApplicationProdProfileTests {


    @Autowired
    ProxyFeatureFlagConfiguration proxyFeatureFlagConfiguration;


    @BeforeAll
    static void beforeAll() {
    }

    @Test
    public void givenprofiles_whenProdProfileSet_ReadProdProfileValues() {

            assertEquals(proxyFeatureFlagConfiguration.getName(), "PROD");
            assertEquals(proxyFeatureFlagConfiguration.enabled, false);
            assertEquals(proxyFeatureFlagConfiguration.proxyAddress, "http://discoverfinancial.com");
        }


}
