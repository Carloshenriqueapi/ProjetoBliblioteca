package com.biblioteca.biblioteca.infrastructure.api.payload.request;

public record ClienteCadastroRequest(

        Long id,

        String nome,
        String sobreNome,
        ClienteEnderecoRequest endereco,
        String dataNascimento,
        String rg,
        String cpf,
        String sexo,
        String email,
        String telefone) {
}
