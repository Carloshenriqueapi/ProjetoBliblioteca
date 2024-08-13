package com.biblioteca.biblioteca.infrastructure.database.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.*;

@Builder
@Entity
@Getter
@Setter
@Embeddable
public class LivrariaEndereco {

private String logradouro;

private String numero;

private String bairro;

private String cep;

private String uf;
}
