package com.biblioteca.biblioteca.infrastructure.api.payload.response;

public record ClienteCadastroResponse(

        Long id,
        String nome,
        String sobreNome,
        ClienteEnderecoResponse endereco,
        String dataNascimento,
        String rg,
        String cpf,
        String sexo,
        String email,
        String telefone) {
}
