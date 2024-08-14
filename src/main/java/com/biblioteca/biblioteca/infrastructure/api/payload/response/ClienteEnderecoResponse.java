package com.biblioteca.biblioteca.infrastructure.api.payload.response;

public record ClienteEnderecoResponse(

        String logradouro,
        String numero,
        String bairro,
        String cep,
        String uf) {
}
