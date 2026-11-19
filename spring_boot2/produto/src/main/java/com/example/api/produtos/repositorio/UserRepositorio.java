package com.example.api.produtos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.produtos.modelo.UserModelo;

public interface UserRepositorio extends JpaRepository<UserModelo, Long> {
    UserModelo findByUsuario(String usuario);
}