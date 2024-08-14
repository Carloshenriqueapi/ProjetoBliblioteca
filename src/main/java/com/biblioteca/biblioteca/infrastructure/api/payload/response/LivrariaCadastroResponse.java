package com.biblioteca.biblioteca.infrastructure.api.payload.response;

public record LivrariaCadastroResponse(

        String razaoSocial,
        String nomeFantasia,
        String cnpj,
        LivrariaEnderecoResponse endereco,

        String email,
        String telefone) {
}
