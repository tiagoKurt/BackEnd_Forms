package com.tiago.aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.aula.modelos.Pessoa;
import com.tiago.aula.service.PessoaService;

@RequestMapping("/pessoas")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> listarPessoas(){
        return this.pessoaService.listarPessoas();
    }

    @PostMapping("/")
    public void salvarPessoa(@RequestBody Pessoa pessoa){
        this.pessoaService.adicionarPessoa(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa pesquisarPessoa(@RequestParam("id") Integer id){
        return this.pessoaService.buscarPessoaPorId(id);
    }

    @PutMapping("/")
    public void alterarPessoa(@RequestBody Pessoa pessoa){
        this.pessoaService.alterarPessoa(pessoa);
    }
    @DeleteMapping("/{id}")
    public void removerPessoa(@PathVariable("id") Integer id){
        this.pessoaService.excluirPessoa(id);
    }

}
