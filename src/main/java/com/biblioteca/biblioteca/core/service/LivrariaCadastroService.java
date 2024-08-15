package com.biblioteca.biblioteca.core.service;

import com.biblioteca.biblioteca.infrastructure.api.payload.request.LivrariaCadastroRequest;
import com.biblioteca.biblioteca.infrastructure.api.payload.response.LivrariaCadastroResponse;
import com.biblioteca.biblioteca.infrastructure.converter.LivrariaCadastroConverter;
import com.biblioteca.biblioteca.infrastructure.database.repository.LivrariaCadastroRepository;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class LivrariaCadastroService {

    private final LivrariaCadastroRepository livrariaCadastroRepository;
    private final LivrariaCadastroConverter livrariaCadastroConverter;

    public List<LivrariaCadastroResponse> getAllLivraria() {
        return this.livrariaCadastroConverter.applyResponse(livrariaCadastroRepository.findAll());
    }

    public Optional<LivrariaCadastroResponse> getLivrariaById(Long id) {
        return livrariaCadastroRepository.findById(id)
                .map(livrariaCadastroConverter::applyResponse);
    }

    public LivrariaCadastroResponse createLivraria(final LivrariaCadastroRequest livraria) {
        return this.livrariaCadastroConverter.applyResponse(
                livrariaCadastroRepository.save(
                        this.livrariaCadastroConverter.apply(livraria)
                )
        );
    }

    public void deleteLivraria(Long id) {
        livrariaCadastroRepository.deleteById(id);
    }
}

