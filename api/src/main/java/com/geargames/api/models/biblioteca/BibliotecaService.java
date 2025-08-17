package com.geargames.api.models.biblioteca;

import com.geargames.api.models.jogos.JogoRepository;
import com.geargames.api.models.jogos.Jogos;
import com.geargames.api.models.usuario.Usuario;
import com.geargames.api.models.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private JogoRepository jogoRepository;

    public Biblioteca adicionarJogoNaBiblioteca(DadosCadastroBiblioteca dados) {
        Usuario usuario = usuarioRepository.findById(dados.id_usuario())
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Jogos jogo = jogoRepository.findById(dados.id_jogo())
            .orElseThrow(() -> new RuntimeException("Jogo não encontrado"));

        // Use o construtor com todos os argumentos para inicializar a entidade
        Biblioteca biblioteca = new Biblioteca( usuario, jogo);

        return bibliotecaRepository.save(biblioteca);
    }
}
