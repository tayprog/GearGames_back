package com.geargames.api.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Troca { 
    private String nome;
    private String descricao;
    private String preco;
    private String imagem;
    private String categoria; 
    private String plataforma;
    private String requisitos;
    private String avaliacao;
    
}
