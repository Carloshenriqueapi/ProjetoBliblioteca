package com.biblioteca.biblioteca.infrastructure.api.payload.response;

public record LivrariaEnderecoResponse (

        String logradouro,
        String numero,
        String bairro,
        String cep,
        String uf) {
}
