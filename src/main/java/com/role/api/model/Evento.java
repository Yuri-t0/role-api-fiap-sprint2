package com.role.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    @ManyToOne
    private Usuario organizador;

    @ManyToOne
    private LocalEvento local;
}
