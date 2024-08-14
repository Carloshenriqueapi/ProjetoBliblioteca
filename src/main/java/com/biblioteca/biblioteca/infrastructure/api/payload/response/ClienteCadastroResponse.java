package com.biblioteca.biblioteca.infrastructure.api.payload.response;

public record ClienteCadastroResponse(

        String nome,
        String sobreNome,
        String dataNascimento,
        String rg,
        String cpf,
        String sexo,
        String email,
        String telefone,

        ClienteEnderecoResponse endereco) {
}
