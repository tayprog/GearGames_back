package com.geargames.api.models.jogos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Jogos {
    private String titulo;                
    private String desenvolvedor;         
    private String distribuidora;        
    private int anoLancamento;           
    private String plataforma;           
    private String modosDeJogo;    
    private double preco;                 
    private double avaliacao;            
    private boolean estaDisponivel;       
    private String faixaEtaria;           
    private String idiomasSuportados; 

    public Jogos(DadosCadastroJogos dados) {
        this.titulo = dados.titulo();
        this.desenvolvedor = dados.desenvolvedor();
        this.distribuidora = dados.distribuidora();
        this.anoLancamento = dados.anoLancamento();
        this.plataforma = dados.plataforma();
        this.modosDeJogo = dados.modosDeJogo();
        this.preco = dados.preco();
        this.avaliacao = dados.avaliacao();
        this.estaDisponivel = dados.estaDisponivel();
        this.faixaEtaria = dados.faixaEtaria();
        this.idiomasSuportados = dados.idiomasSuportados();
    }

    
}