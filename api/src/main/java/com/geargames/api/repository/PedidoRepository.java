package com.geargames.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.geargames.api.models.pedido.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
