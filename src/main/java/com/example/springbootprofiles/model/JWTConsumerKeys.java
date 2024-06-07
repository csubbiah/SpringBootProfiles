package com.example.springbootprofiles.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JWTConsumerKeys {

    public String ApiKey;
    public String SecretKey;
    public String ConsumerCert;
}
