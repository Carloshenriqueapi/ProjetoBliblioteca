package com.biblioteca.biblioteca.infrastructure.converter;

import com.biblioteca.biblioteca.infrastructure.api.payload.request.ClienteCadastroRequest;
import com.biblioteca.biblioteca.infrastructure.api.payload.response.ClienteCadastroResponse;
import com.biblioteca.biblioteca.infrastructure.api.payload.response.ClienteEnderecoResponse;
import com.biblioteca.biblioteca.infrastructure.database.entity.ClienteCadastro;
import com.biblioteca.biblioteca.infrastructure.database.entity.ClienteEndereco;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ClienteCadastroConverter implements Function<ClienteCadastroRequest, ClienteCadastro> {
    @Override
    public ClienteCadastro apply(ClienteCadastroRequest clienteCadastroRequest) {
        return ClienteCadastro.builder()
                .nome(clienteCadastroRequest.nome())
                .sobreNome(clienteCadastroRequest.sobreNome())
                .cpf(clienteCadastroRequest.cpf())
                .rg(clienteCadastroRequest.rg())
                .endereco(
                        ClienteEndereco.builder()
                                .logradouro(clienteCadastroRequest.endereco().logradouro())
                                .numero(clienteCadastroRequest.endereco().numero())
                                .bairro(clienteCadastroRequest.endereco().bairro())
                                .cep(clienteCadastroRequest.endereco().cep())
                                .uf(clienteCadastroRequest.endereco().uf())
                                .build()
                )
                .email(clienteCadastroRequest.email())
                .telefone(clienteCadastroRequest.telefone())
                .build();
    }

    public List<ClienteCadastroResponse> applyResponse(List<ClienteCadastro> list) {
        if (list != null && !list.isEmpty()) {
            return list.stream().map(clienteCadastro -> {
                return new ClienteCadastroResponse(
                        clienteCadastro.getNome(),
                        clienteCadastro.getSobreNome(),
                        clienteCadastro.getDataNascimento(),
                        clienteCadastro.getRg(),
                        clienteCadastro.getCpf(),
                        clienteCadastro.getSexo(),
                        clienteCadastro.getEmail(),
                        clienteCadastro.getTelefone(),
                        new ClienteEnderecoResponse(
                                clienteCadastro.getEndereco().getLogradouro(),
                                clienteCadastro.getEndereco().getNumero(),
                                clienteCadastro.getEndereco().getBairro(),
                                clienteCadastro.getEndereco().getCep(),
                                clienteCadastro.getEndereco().getUf())
                );
            }).collect(Collectors.toList());
        }
        return null;
    }

public ClienteCadastroResponse applyResponse(ClienteCadastroResponse clienteCadastro) {
        return new ClienteCadastroResponse(
                clienteCadastro.nome(),
                clienteCadastro.sobreNome(),
                clienteCadastro.dataNascimento(),
                clienteCadastro.rg(),
                clienteCadastro.cpf(),
                clienteCadastro.sexo(),
                clienteCadastro.email(),
                clienteCadastro.telefone(),
                new ClienteEnderecoResponse(
                        clienteCadastro.endereco().logradouro(),
                        clienteCadastro.endereco().numero(),
                        clienteCadastro.endereco().bairro(),
                        clienteCadastro.endereco().cep(),
                        clienteCadastro.endereco().uf())
        );




}
}

