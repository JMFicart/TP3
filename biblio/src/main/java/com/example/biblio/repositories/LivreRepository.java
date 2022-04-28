package com.example.biblio.repositories;

import com.example.biblio.models.livre.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Long> {
}
