package com.geargames.api.models.pagamento;

import java.time.LocalDateTime;

import com.geargames.api.models.pedido.Pedido;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pagamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
    
    private double valorPago;
    private String metodoPagamento;
    private LocalDateTime dataPagamento;
    private String status;
    private String comprovante;
    private String reembolso;
}