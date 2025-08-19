package com.geargames.api.models.biblioteca;



import java.util.HashSet;
import java.util.Set;

import com.geargames.api.models.jogos.Jogos;
import com.geargames.api.models.usuario.Usuario;

import jakarta.persistence.*;
import lombok.*;

@Entity
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

    @OneToMany(mappedBy = "biblioteca") // Uma biblioteca tem vários jogos
    private Set<Jogos> jogos = new HashSet<>();
    
    public Biblioteca(Usuario usuario, Jogos jogo) {
        this.usuario = usuario;
        this.jogos = (Set<Jogos>) jogo;
    }

}