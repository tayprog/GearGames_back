package com.geargames.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geargames.api.models.biblioteca.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long>{

}
