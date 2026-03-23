package com.exerciciospa.gerenciadorpedidos.repository;

import com.exerciciospa.gerenciadorpedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}