package com.biblioteca.biblioteca.infrastructure.api.payload.request;

public record LivrariaCadastroRequest (

        Long id,
        String razaoSocial,
        String nomeFantasia,
        String cnpj,
        LivrariaEnderecoRequest endereco,
        String email,
        String telefone) {

}

