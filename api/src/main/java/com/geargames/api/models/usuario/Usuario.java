package com.geargames.api.models.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private String datadenascimento;
    private String telefone;

    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.senha = dados.senha();
        this.datadenascimento = dados.datadenascimento();
        this.telefone = dados.telefone();
    }
}
