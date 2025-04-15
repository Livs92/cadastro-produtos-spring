package com.exemplo.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<com.exemplo.produtos.model.Produto, Long> {}
