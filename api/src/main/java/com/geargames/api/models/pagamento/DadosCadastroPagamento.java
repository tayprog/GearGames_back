package com.geargames.api.models.pagamento;

import java.time.LocalDateTime;

import com.geargames.api.models.usuario.Usuario;

public record DadosCadastroPagamento(
    String idPagamento,           
    String jogo,                    
    Usuario usuario,              
    double valorPago,             
    String metodoPagamento,       
    LocalDateTime dataPagamento,  
    String status,                
    String comprovante, 
    String reembolso) {
} 