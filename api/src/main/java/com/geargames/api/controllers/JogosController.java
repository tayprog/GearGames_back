package com.geargames.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.geargames.api.dto.DadosCadastroJogos;
import com.geargames.api.models.jogos.Jogos;
import com.geargames.api.repository.JogoRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    @Autowired
    private JogoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarJogos(@RequestBody DadosCadastroJogos dados) {
        repository.save(new Jogos(dados));
    }

    @GetMapping
    public List<Jogos> listarJogos() {
        return repository.findAll();
    }

    @PutMapping
    @Transactional
    public void atualizarJogos(@RequestBody DadosCadastroJogos dados) {
        var jogos = repository.getReferenceById(dados.id());
        jogos.atualizarInformacoes(dados);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public void excluirJogosLogico(@PathVariable Long id) {
        var jogos = repository.getReferenceById(id);
        jogos.exclusaoLogica();
    }
}