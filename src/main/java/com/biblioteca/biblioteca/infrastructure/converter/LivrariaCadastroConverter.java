package com.biblioteca.biblioteca.infrastructure.converter;

import com.biblioteca.biblioteca.infrastructure.api.payload.request.LivrariaCadastroRequest;
import com.biblioteca.biblioteca.infrastructure.api.payload.response.LivrariaCadastroResponse;
import com.biblioteca.biblioteca.infrastructure.api.payload.response.LivrariaEnderecoResponse;
import com.biblioteca.biblioteca.infrastructure.database.entity.LivrariaCadastro;
import com.biblioteca.biblioteca.infrastructure.database.entity.LivrariaEndereco;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LivrariaCadastroConverter implements Function<LivrariaCadastroRequest, LivrariaCadastro> {
    @Override
    public LivrariaCadastro apply(LivrariaCadastroRequest livrariaCadastroRequest) {

        return LivrariaCadastro.builder()
                .razaoSocial(livrariaCadastroRequest.razaoSocial())
                .nomeFantasia(livrariaCadastroRequest.nomeFantasia())
                .cnpj(livrariaCadastroRequest.cnpj())
                .endereco(
                        LivrariaEndereco.builder()
                                .logradouro(livrariaCadastroRequest.endereco().logradouro())
                                .bairro(livrariaCadastroRequest.endereco().bairro())
                                .cep(livrariaCadastroRequest.endereco().cep())
                                .uf(livrariaCadastroRequest.endereco().uf())
                                .build()

                )
                .email(livrariaCadastroRequest.email())
                .telefone(livrariaCadastroRequest.telefone())
                .build();
    }

    public List<LivrariaCadastroResponse> applyResponse(List<LivrariaCadastro> list) {

        if(list != null && !list.isEmpty()) {
            return list.stream().map(livraria -> {

                return new LivrariaCadastroResponse(
                        livraria.getRazaoSocial(),
                        livraria.getNomeFantasia(),
                        livraria.getCnpj(),
                        new LivrariaEnderecoResponse(
                                livraria.getEndereco().getLogradouro(),
                                livraria.getEndereco().getNumero(),
                                livraria.getEndereco().getBairro(),
                                livraria.getEndereco().getCep(),
                                livraria.getEndereco().getUf()),
                        livraria.getEmail(),
                        livraria.getTelefone());

            }).collect(Collectors.toList());
        }
        return null;

    }
public LivrariaCadastroResponse applyResponse(LivrariaCadastro livraria) {
 return new LivrariaCadastroResponse(
         livraria.getRazaoSocial(),
         livraria.getNomeFantasia(),
         livraria.getCnpj(),
         new LivrariaEnderecoResponse(
                 livraria.getEndereco().getLogradouro(),
                 livraria.getEndereco().getNumero(),
                 livraria.getEndereco().getBairro(),
                 livraria.getEndereco().getCep(),
                 livraria.getEndereco().getUf()),
         livraria.getEmail(),
         livraria.getTelefone());

 }
}
