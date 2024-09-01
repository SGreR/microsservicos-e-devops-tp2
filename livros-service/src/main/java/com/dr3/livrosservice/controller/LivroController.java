package com.dr3.livrosservice.controller;

import com.dr3.livrosservice.model.Livro;
import com.dr3.livrosservice.service.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getLivroById(@PathVariable Long id) {
        Optional<Livro> livro = livroService.findById(id);
        return livro.isPresent() ? ResponseEntity.ok(livro.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.save(livro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteLivroById(@PathVariable Long id) {
        livroService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
