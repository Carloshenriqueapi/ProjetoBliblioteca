package com.biblioteca.biblioteca.infrastructure.api.payload.request;

public record ClienteEnderecoRequest(

        String logradouro,
        String numero,
        String bairro,
        String cep,
        String uf) {
}
