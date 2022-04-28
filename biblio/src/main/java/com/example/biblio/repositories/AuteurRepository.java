package com.example.biblio.repositories;

import com.example.biblio.models.auteur.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long>{
}

