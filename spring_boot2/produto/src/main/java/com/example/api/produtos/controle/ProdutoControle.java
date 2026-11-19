package com.example.api.produtos.controle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.produtos.modelo.ProdutoModelo;
import com.example.api.produtos.modelo.RespostaModelo;
import com.example.api.produtos.modelo.UserModelo;
import com.example.api.produtos.servico.LoginServico;
import com.example.api.produtos.servico.ProdutoServico;

@RestController 
public class ProdutoControle {

    private final ProdutoServico produtoServico;
    private final LoginServico loginServico;

    public ProdutoControle(ProdutoServico produtoServico, LoginServico loginServico) {
        this.produtoServico = produtoServico;
        this.loginServico = loginServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo produto){
        return produtoServico.cadastrarAlterar(produto, "cadastrar");
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModelo produto){
        return produtoServico.cadastrarAlterar(produto, "alterar");
    }

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return produtoServico.listar();
    }

    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<RespostaModelo> remover(@PathVariable("codigo") Long codigo){
        return produtoServico.remover(codigo);
    }

    @PostMapping ("/login")
    public  ResponseEntity<?> login(@RequestBody  UserModelo usuario){
        return loginServico.login(usuario);
    }
    @GetMapping("/")
    public String rota(){
        return "api de produto funcionando!";
    }
}