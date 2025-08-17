package com.geargames.api.models.pedido;

import java.time.LocalDateTime;
import java.util.Set;

import com.geargames.api.models.jogos.Jogos;
import com.geargames.api.models.pagamento.Pagamento;
import com.geargames.api.models.usuario.Usuario;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "pedidos")
@Entity(name = "pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    @ManyToMany
    @JoinTable(
    name = "pedido_jogo",
    joinColumns = @JoinColumn(name = "pedido_id"),
    inverseJoinColumns = @JoinColumn(name = "jogo_id")
    )                   
    private Set<Jogos> jogos;

    private double valorTotal;                 
    private LocalDateTime dataPedido;          
    private String status;                     
    private String codigoRastreamento;         
    private String tipoEntrega;                
    private String observacoes;
    
    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)                
    private Pagamento pagamento;              
}

