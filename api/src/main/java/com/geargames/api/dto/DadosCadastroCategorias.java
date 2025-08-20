package com.geargames.api.dto;

public record DadosCadastroCategorias(
    String nome,                  
    String descricao,             
    String jogosRelacionados, 
    int nota,             
    String publicoAlvo) {
} 