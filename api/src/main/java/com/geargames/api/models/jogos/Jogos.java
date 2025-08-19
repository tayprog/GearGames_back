package com.geargames.api.models.jogos;


import com.geargames.api.models.biblioteca.Biblioteca;
import com.geargames.api.models.usuario.Usuario;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jogos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jogos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String desenvolvedor;
    private String distribuidora;
    private int anoLancamento;

    

    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "biblioteca_id") 
    private Biblioteca biblioteca;
    
    private Double preco; 
    private boolean estaDisponivel;
   

    private Boolean ativo = true;

    public Jogos(DadosCadastroJogos dados) {
        this.id = dados.id();
        this.titulo = dados.titulo();
        this.desenvolvedor = dados.desenvolvedor();
        this.distribuidora = dados.distribuidora();
        this.anoLancamento = dados.anoLancamento();
        this.usuario = dados.usuario();
        this.categoria = dados.categoria(); 
        this.preco = dados.preco();
        this.estaDisponivel = dados.estaDisponivel();
     
    }

    public void atualizarInformacoes(DadosCadastroJogos dados) {
        if(dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if(dados.desenvolvedor() != null) {
            this.desenvolvedor = dados.desenvolvedor();
        }
        if(dados.distribuidora() != null) {
            this.distribuidora = dados.distribuidora();
        }
        if(dados.preco() != null) { 
            this.preco = dados.preco();
        }
       
    }

    public void exclusaoLogica() {
            this.ativo = false;
    }



}