package com.geargames.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.geargames.api.models.carrinho.Carrinho;

public interface CarrinhoRepository extends JpaRepository <Carrinho, Long> {

}
