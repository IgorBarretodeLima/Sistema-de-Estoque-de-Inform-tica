package br.com.senai.techbyte.controller;

import br.com.senai.techbyte.model.Produto;
import br.com.senai.techbyte.service.ProdutoService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    public Produto cadadastrarProduto(String nome, String descricao, BigDecimal preco){
        return service.cadastrarProduto(nome, descricao, preco);
    }
    public List<Produto> listarProdutos(){
        return service.listarProdutos();
    }
    public Optional<Produto>buscarPorId(long id){
        return service.buscarPorId(id);
    }
    public boolean atualizarProduto(long id, String nome, String descricao, BigDecimal preco){
        return service.atualizarProduto(id, nome, descricao, preco);
    }
    public boolean removerProduto(long id){
        return service.removerProduto(id);
    }

}