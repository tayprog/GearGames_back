package com.geargames.api.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geargames.api.models.usuario.Usuario;


    public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
        Optional<Usuario> findByEmail(String email);

    
}
