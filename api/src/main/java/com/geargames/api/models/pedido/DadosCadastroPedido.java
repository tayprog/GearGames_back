package com.geargames.api.models.pedido;

import java.time.LocalDateTime;
import java.util.List;

import com.geargames.api.models.pagamento.Pagamento;
import com.geargames.api.models.usuario.Usuario;

public record DadosCadastroPedido(
    String idPedido,                   
    Usuario usuario,                   
    List<Jogo> jogos,                  
    double valorTotal,                 
    LocalDateTime dataPedido,          
    String status,                     
    String codigoRastreamento,         
    String tipoEntrega,                
    String observacoes,                
    Pagamento pagamento) {
} 