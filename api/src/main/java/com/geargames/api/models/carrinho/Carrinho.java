package com.geargames.api.models.carrinho;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho {
    private String idusuario;
    private String preco;
    private String itens;

    public Carrinho(DadosCadastroCarrinho dados) {
        this.idusuario = dados.idusuario();
        this.preco = dados.preco();
        this.itens = dados.itens();
    }
}
