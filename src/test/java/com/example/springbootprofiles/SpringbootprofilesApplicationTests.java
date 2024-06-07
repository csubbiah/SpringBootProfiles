package com.example.springbootprofiles;

import static org.junit.jupiter.api.Assertions.*;
import com.example.springbootprofiles.spring.ProxyFeatureFlagConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootprofilesApplicationTests {


    @Autowired
    ProxyFeatureFlagConfiguration proxyFeatureFlagConfiguration;


    @BeforeAll
    static void beforeAll() {

    }

    @Test
    public void givenprofiles_whenDevProfileSet_ReadDevProfileValues() {

            assertEquals(proxyFeatureFlagConfiguration.getName(), "DEV");
        }


}
