package baozistore.repository;

import baozistore.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // interface para gerenciar os dados dos clientes no banco h2
}