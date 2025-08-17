package com.geargames.api.models.jogos;

import com.geargames.api.models.usuario.Usuario;

public record DadosCadastroJogos(
    Long id,
    String titulo,                
    String desenvolvedor,         
    String distribuidora,        
    int anoLancamento,
    Usuario usuario,           
    String plataforma,           
    String modosDeJogo, 
    Categoria categoria,   
    Double preco,                 
    Double avaliacao,            
    boolean estaDisponivel,       
    String faixaEtaria,           
    String idiomasSuportados) {
} 