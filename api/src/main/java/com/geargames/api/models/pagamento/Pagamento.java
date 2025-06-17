package com.geargames.api.models.pagamento;

import java.time.LocalDateTime;

import com.geargames.api.models.usuario.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {
    private String idPagamento;           
    private String jogo;                    
    private Usuario usuario;              
    private double valorPago;             
    private String metodoPagamento;       
    private LocalDateTime dataPagamento;  
    private String status;                
    private String comprovante; 
    private String reembolso; 
    
    public Pagamento(DadosCadastroPagamento dados) {
        this.idPagamento = dados.idPagamento();
        this.jogo = dados.jogo();
        this.usuario = dados.usuario();
        this.valorPago = dados.valorPago();
        this.metodoPagamento = dados.metodoPagamento();
        this.dataPagamento = dados.dataPagamento();
        this.status = dados.status();
        this.comprovante = dados.comprovante();
        this.reembolso = dados.reembolso();
    }
}