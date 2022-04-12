package com.example.biblio.utils;

import com.example.biblio.models.Auteur;
import com.example.biblio.repositories.AuteurRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFiller implements InitializingBean{
    private final AuteurRepository aRepo;

    public DatabaseFiller(AuteurRepository aRepo) {
        this.aRepo = aRepo;
    }

    private void setupAuteur(){
        Auteur a = Auteur.builder()
                .idAuteur(1)
                .nomAuteur("Jules Verne")
                .nationaliteAuteur("France")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(2)
                .nomAuteur("Jack Vance")
                .nationaliteAuteur("USA")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(3)
                .nomAuteur("Frank Herbert")
                .nationaliteAuteur("USA")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(4)
                .nomAuteur("Arthur C Clark")
                .nationaliteAuteur("GB")
                .build();
        aRepo.save(a);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupAuteur();
    }
}

