package com.geargames.api.dto;

import com.geargames.api.models.biblioteca.Biblioteca;
import com.geargames.api.models.pedido.Pedido;

public record DadosCadastroUsuario(
    String nome,
    String email,
    String cpf,
    String senha,
    String datadenascimento,
    String telefone,
    Pedido pedido,
    Biblioteca biblioteca
  ) {
} 