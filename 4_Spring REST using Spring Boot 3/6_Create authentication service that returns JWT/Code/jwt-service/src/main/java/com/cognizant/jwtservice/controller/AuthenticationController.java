package com.cognizant.jwtservice.controller;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("sayHello() method called");
        LOGGER.info("Authorization Header: {}", authHeader);
        Map<String, String> response = new HashMap<>();
        response.put("token", generateJwt(getUser(authHeader)));
        return response;
    }

    private String getUser(String authHeader) {
        LOGGER.info("getUser() method called with header: {}", authHeader);
        if (authHeader.startsWith("Basic ")) {
            authHeader = authHeader.substring("Basic ".length());
        }
        String usernamePassword = new String(Base64.getDecoder().decode(authHeader));
        String username = usernamePassword.split(":")[0];
        LOGGER.info("username: {}", username);
        return username;
    }

    private String generateJwt(String user) {
        LOGGER.info("generateJwt() method called");
        SecretKey key = Jwts.SIG.HS256.key().build();
        String token = Jwts
                .builder()
                .subject(user)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1200000))
                .signWith(key)
                .compact();
        LOGGER.info("Generated JWT: {}", token);
        return token;
    }
}
