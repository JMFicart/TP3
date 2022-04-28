package com.example.biblio.repositories;

import com.example.biblio.models.usager.Usager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsagerRepository  extends JpaRepository<Usager, Long> {
}
