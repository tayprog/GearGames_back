package com.geargames.api.models.usuario;


public record DadosCadastroUsuario(
    String nome,
    String email,
    String cpf,
    String senha,
    String datadenascimento) {
} 