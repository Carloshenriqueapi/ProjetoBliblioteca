package com.biblioteca.biblioteca.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ClienteCadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobreNome;

    private String dataNascimento;
    private String rg;
    private String cpf;
    private String sexo;
    private String email;
    private String telefone;

    @OneToOne(cascade = CascadeType.ALL)
    private ClienteEndereco endereco;

}