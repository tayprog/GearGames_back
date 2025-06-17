package com.geargames.api.models.biblioteca;

public record DadosCadastroBiblioteca(
    String nome,
    String endereco,
    String jogosDisponiveis,
    String usuariosCadastrados,
    int capacidadeMaximaLivros) {
} 