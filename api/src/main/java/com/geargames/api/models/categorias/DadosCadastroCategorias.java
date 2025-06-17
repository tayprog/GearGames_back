package com.geargames.api.models.categorias;

public record DadosCadastroCategorias(
    String nome,                  
    String descricao,             
    String jogosRelacionados, 
    int nota,             
    String publicoAlvo) {
} 