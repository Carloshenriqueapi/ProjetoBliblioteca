package com.biblioteca.biblioteca.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Entity
@Getter
@Setter

public class ClienteCadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobreNome;

    @Embedded
    private ClienteEndereco endereco;

    private String dataNascimento;
    private String rg;
    private String cpf;
    private String sexo;
    private String email;
    private String telefone;

}