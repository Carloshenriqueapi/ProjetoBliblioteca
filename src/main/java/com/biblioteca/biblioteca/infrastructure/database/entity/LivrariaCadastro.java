package com.biblioteca.biblioteca.infrastructure.database.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Builder
@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LivrariaCadastro implements Serializable {
    private Long id;

    private String razaoSocial;

    private String nomeFantasia;

    @Embedded
    private LivrariaEndereco endereco;

    private String cnpj;

    private String email;

    private String telefone;
}
