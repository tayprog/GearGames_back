package com.geargames.api.services.infra_security;



import java.time.*;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.geargames.api.models.usuario.Usuario;

@Service

public class TokenService {

    @Value("${api.security.secret}")
    private String secret;
    public String genarateToken(Usuario user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            String token = JWT.create()
                .withIssuer("login-auth-api")
                .withSubject(user.getEmail())
                .withExpiresAt(this.genarateExpirationDate())
                .sign(algorithm);
            return token;
        } catch (JWTCreationException exeption) {
            throw new RuntimeErrorException(null, "Error while authenticating");
        }
        
    }

    String validateToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
            .withIssuer("login-auth-api")
            .build()
            .verify(token)
            .getSubject();
        } catch (JWTVerificationException exception) {
            return null;
        }
    }
    private Instant genarateExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-3"));
    }

}
