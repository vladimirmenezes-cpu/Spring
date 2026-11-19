package com.example.api.produtos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.produtos.modelo.ProdutoModelo;

public interface  ProdutoRepositorio extends JpaRepository<ProdutoModelo,Long> {
    
}
