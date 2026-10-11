package baozistore.repository;

import baozistore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // interface para gerenciar os dados dos produtos no banco h2
}