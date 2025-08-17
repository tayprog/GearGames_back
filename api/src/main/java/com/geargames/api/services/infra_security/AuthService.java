package com.geargames.api.services.infra_security;



import com.geargames.api.dto.LoginRequestDTO;
import com.geargames.api.dto.RegisterRequestDTO;
import com.geargames.api.dto.ResponseDTO;
import com.geargames.api.models.usuario.Usuario;
import com.geargames.api.models.usuario.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    public ResponseEntity<ResponseDTO> authenticate(LoginRequestDTO body) {
        Optional<Usuario> userOptional = repository.findByEmail(body.email());

        if (userOptional.isPresent()) {
            Usuario user = userOptional.get();
            if (passwordEncoder.matches(body.password(), user.getSenha())) {
                String token = tokenService.genarateToken(user);
                return ResponseEntity.ok(new ResponseDTO(user.getNome(), token));
            }
        }
        return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<ResponseDTO> register(RegisterRequestDTO body) {
        Optional<Usuario> userOptional = repository.findByEmail(body.email());

        if (userOptional.isEmpty()) {
            Usuario newUser = new Usuario();
            newUser.setSenha(passwordEncoder.encode(body.password()));
            newUser.setEmail(body.email());
            newUser.setNome(body.name());
            repository.save(newUser);

            String token = tokenService.genarateToken(newUser);
            return ResponseEntity.ok(new ResponseDTO(newUser.getNome(), token));
        }

        return ResponseEntity.badRequest().build();
    }
}