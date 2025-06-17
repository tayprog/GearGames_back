package com.geargames.api.models.pedido;

import java.time.LocalDateTime;
import java.util.List;

import com.geargames.api.models.pagamento.Pagamento;
import com.geargames.api.models.usuario.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private String idPedido;                   
    private Usuario usuario;                   
    private List<Jogo> jogos;                  
    private double valorTotal;                 
    private LocalDateTime dataPedido;          
    private String status;                     
    private String codigoRastreamento;         
    private String tipoEntrega;                
    private String observacoes;                
    private Pagamento pagamento;              
}

