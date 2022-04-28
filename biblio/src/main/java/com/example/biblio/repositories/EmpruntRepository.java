package com.example.biblio.repositories;

import com.example.biblio.models.emprunt.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntRepository  extends JpaRepository<Emprunt, Long> {
}
