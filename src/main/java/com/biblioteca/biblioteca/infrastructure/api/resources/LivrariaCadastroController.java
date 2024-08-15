package com.biblioteca.biblioteca.infrastructure.api.resources;

import com.biblioteca.biblioteca.core.service.LivrariaCadastroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livraria")
@AllArgsConstructor
public class LivrariaCadastroController {

    private final LivrariaCadastroService livrariaService;

}
