package com.geargames.api.controllers;

import com.geargames.api.dto.LoginRequestDTO;
import com.geargames.api.dto.RegisterRequestDTO;
import com.geargames.api.dto.ResponseDTO;
import com.geargames.api.services.infra_security.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> login(@RequestBody LoginRequestDTO body) {
        return authService.authenticate(body);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<ResponseDTO> cadastro(@RequestBody RegisterRequestDTO body) {
        return authService.register(body);
    }
}