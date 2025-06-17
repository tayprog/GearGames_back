package com.geargames.api.models.troca;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Troca { 
    private String nome;
    private String descricao;
    private String preco;
    private String imagem;
    private String categoria; 
    private String plataforma;
    private String requisitos;
    private String avaliacao;
    
    public Troca(DadosCadastroTroca dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.imagem = dados.imagem();
        this.categoria = dados.categoria();
        this.plataforma = dados.plataforma();
        this.requisitos = dados.requisitos();
        this.avaliacao = dados.avaliacao();

    }
}
