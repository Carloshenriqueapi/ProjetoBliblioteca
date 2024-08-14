package com.biblioteca.biblioteca.infrastructure.api.payload.response;

public record LivrariaCadastroResponse(

        Long id,
        String razaoSocial,
        String nomeFantasia,
        String cnpj,
        LivrariaEnderecoResponse endereco,
        String email,
        String telefone) {
}
