package com.tiago.aula.service;

import com.tiago.aula.modelos.Pessoa;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tiago.aula.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void adicionarPessoa(Pessoa pessoa){
        this.pessoaRepository.save(pessoa);
    }
    public void alterarPessoa(Pessoa pessoa){
        this.pessoaRepository.save(pessoa);
    }

    public void excluirPessoa(Integer id){
        this.pessoaRepository.deleteById(id);
    }
    public List<Pessoa> listarPessoas(){
        return this.pessoaRepository.findAll();
    }
    public Pessoa buscarPessoaPorId(Integer id){
        return this.pessoaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Pessoa com o ID " + id + " não encontrada."));

    }






}
