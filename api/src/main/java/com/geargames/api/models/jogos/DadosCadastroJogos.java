package com.geargames.api.models.jogos;

public record DadosCadastroJogos(
    String titulo,                
    String desenvolvedor,         
    String distribuidora,        
    int anoLancamento,           
    String plataforma,           
    String modosDeJogo,    
    double preco,                 
    double avaliacao,            
    boolean estaDisponivel,       
    String faixaEtaria,           
    String idiomasSuportados) {
} 