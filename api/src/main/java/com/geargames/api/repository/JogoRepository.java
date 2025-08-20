package com.geargames.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.geargames.api.models.jogos.Jogos;

public interface JogoRepository extends JpaRepository <Jogos, Long> {
    
}
