package com.dr3.livrosservice.repository;

import com.dr3.livrosservice.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
