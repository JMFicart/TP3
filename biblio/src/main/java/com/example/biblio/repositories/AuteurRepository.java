package com.example.biblio.repositories;

import com.example.biblio.models.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long>{
}

