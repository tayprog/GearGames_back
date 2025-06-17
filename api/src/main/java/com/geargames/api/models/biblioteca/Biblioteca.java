package com.geargames.api.models.biblioteca;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Biblioteca {
    private String nome;
    private String endereco;
    private String jogosDisponiveis;
    private String usuariosCadastrados;

    public Biblioteca(DadosCadastroBiblioteca dados) {
        this.nome = dados.nome();
        this.endereco = dados.endereco();
        this.jogosDisponiveis = dados.jogosDisponiveis();
        this.usuariosCadastrados = dados.usuariosCadastrados();

    }
}
