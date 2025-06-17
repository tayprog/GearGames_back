package com.geargames.api.models.troca;

public record DadosCadastroTroca(
    String nome,
    String descricao,
    String preco,
    String imagem,
    String categoria, 
    String plataforma,
    String requisitos,
    String avaliacao) {
} 