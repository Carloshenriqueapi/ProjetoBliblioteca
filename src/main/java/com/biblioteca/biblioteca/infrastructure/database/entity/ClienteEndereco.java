package com.biblioteca.biblioteca.infrastructure.database.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Entity
@Getter
@Setter
@Embeddable
public class ClienteEndereco {

    private String logradouro;

    private String numero;

    private String bairro;

    private String cep;

    private String uf;
}
