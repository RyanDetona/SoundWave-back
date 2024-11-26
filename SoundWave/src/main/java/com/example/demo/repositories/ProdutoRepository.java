package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Operações básicas já são fornecidas automaticamente pelo Spring Data JPA
}
