package com.geargames.api.dto;

import java.time.LocalDateTime;

import com.geargames.api.models.usuario.Usuario;

public record DadosCadastroPagamento(
    Long idPagamento,           
    String jogo,                    
    Usuario usuario,              
    double valorPago,             
    String metodoPagamento,       
    LocalDateTime dataPagamento,  
    String status,                
    String comprovante, 
    String reembolso) {
} 