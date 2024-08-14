package com.biblioteca.biblioteca.infrastructure.api.payload.request;

public record LivrariaEnderecoRequest (

        String logradouro,

        String numero,
        String bairro,
        String cep,
        String uf) {
}
