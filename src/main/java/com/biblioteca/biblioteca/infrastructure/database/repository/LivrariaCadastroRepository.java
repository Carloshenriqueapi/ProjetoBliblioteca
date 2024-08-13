package com.biblioteca.biblioteca.infrastructure.database.repository;

import com.biblioteca.biblioteca.infrastructure.database.entity.LivrariaCadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrariaCadastroRepository  extends JpaRepository<LivrariaCadastro, Long>{
}
