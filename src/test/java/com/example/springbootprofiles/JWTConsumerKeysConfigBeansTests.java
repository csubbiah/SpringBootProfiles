package com.example.springbootprofiles;

import com.example.springbootprofiles.model.JWTConsumerKeys;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class JWTConsumerKeysConfigBeansTests {

    @SpyBean
    public JWTConsumerKeys jwtConsumerKeys;

    @Test
    public void givenJwtConsumerKeys_whenGetApiKey_thenReadJWTAPIKEY_Success()
    {
        //Arrange
        when(jwtConsumerKeys.getApiKey()).thenReturn("12345");
        //Act
        String JwtApiKey = jwtConsumerKeys.getApiKey();
        //Assert
        assertEquals("12345", JwtApiKey);
    }

    @Test
    public void givenJwtConsumerKeys_whenGetSecretKey_thenReadSecretKey_Success()
    {
        //Arrange
        when(jwtConsumerKeys.getSecretKey()).thenReturn("6789");
        //Act
        String SecretKey = jwtConsumerKeys.getSecretKey();
        //Assert
        assertEquals("6789", SecretKey);
    }

    @Test
    public void givenJwtConsumerKeys_whenGetConsumerCert_thenReadConsumerCert_Success()
    {
        //Arrange
        when(jwtConsumerKeys.getConsumerCert()).thenReturn("0000");
        //Act
        String ConsumerCert = jwtConsumerKeys.getConsumerCert();
        //Assert
        assertEquals("0000", ConsumerCert);
    }
}
