package com.geargames.api.models.jogos;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jogos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;                
    private String desenvolvedor;         
    private String distribuidora;        
    private int anoLancamento;           
    private String plataforma;           
    private String modosDeJogo;
    
    @Enumerated(EnumType.STRING)
    private Categoria Categoria;

    private double preco;                 
    private double avaliacao;            
    private boolean estaDisponivel;       
    private String faixaEtaria;           
    private String idiomasSuportados;
    
    private Boolean ativo = true;

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