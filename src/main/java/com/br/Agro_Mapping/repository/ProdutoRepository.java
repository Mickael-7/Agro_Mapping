package com.br.Agro_Mapping.repository;

import com.br.Agro_Mapping.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    List<Produto> findByNome(String nome);
}
