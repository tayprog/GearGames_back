package com.geargames.api.models.categorias;

import com.geargames.api.dto.DadosCadastroCategorias;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categorias {
    private String nome;                  
    private String descricao;             
    private String jogosRelacionados; 
    private int nota;             
    private String publicoAlvo;

    public Categorias(DadosCadastroCategorias dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.jogosRelacionados = dados.jogosRelacionados();
        this.nota = dados.nota();
        this.publicoAlvo = dados.publicoAlvo();
    }
}
