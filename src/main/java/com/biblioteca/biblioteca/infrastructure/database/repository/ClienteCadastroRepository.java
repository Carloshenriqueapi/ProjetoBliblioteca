package com.biblioteca.biblioteca.infrastructure.database.repository;

import com.biblioteca.biblioteca.infrastructure.database.entity.ClienteCadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteCadastroRepository  extends JpaRepository<ClienteCadastro, Long>{
}
