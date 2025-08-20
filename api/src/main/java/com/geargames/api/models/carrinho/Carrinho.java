package com.geargames.api.models.carrinho;



import com.geargames.api.dto.DadosCadastroCarrinho;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "Carrinho")
@Entity(name = "Carrinhos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String preco;
    private String itens;

    public Carrinho(DadosCadastroCarrinho dados) {
        this.preco = dados.preco();
        this.itens = dados.itens();
    }
}
