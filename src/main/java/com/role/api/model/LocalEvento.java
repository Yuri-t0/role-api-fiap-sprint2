package com.role.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LocalEvento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private Double latitude;
    private Double longitude;
}
