package com.geargames.api.models.biblioteca;



import com.geargames.api.models.jogos.Jogos;
import com.geargames.api.models.usuario.Usuario;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "biblioteca")
@Getter
@Setter
@NoArgsConstructor
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Chave primária da tabela

    @ManyToOne // Uma biblioteca tem um único usuário
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne // Uma biblioteca tem um único jogo
    @JoinColumn(name = "jogo_id")
    private Jogos jogos;
    
    public Biblioteca(Usuario usuario, Jogos jogos) {
        this.usuario = usuario;
        this.jogos = jogos;
    }

}