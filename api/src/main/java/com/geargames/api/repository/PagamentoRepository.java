package com.geargames.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geargames.api.models.pagamento.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
