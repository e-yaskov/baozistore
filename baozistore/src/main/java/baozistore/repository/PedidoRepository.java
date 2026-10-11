package baozistore.repository;

import baozistore.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // interface para gerenciar os dados dos pedidos no banco h2
}