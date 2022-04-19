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
                .idAuteur(1L)
                .nomAuteur("Jules Verne")
                .nationaliteAuteur("France")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(2L)
                .nomAuteur("Jack Vance")
                .nationaliteAuteur("USA")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(3L)
                .nomAuteur("Frank Herbert")
                .nationaliteAuteur("USA")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(4L)
                .nomAuteur("Arthur C Clarke")
                .nationaliteAuteur("GB")
                .build();
        aRepo.save(a);
    }

//    private void setupLivre(){
//        Livre l = Livre.builder()
//                .idLivre(1)
//                .build();
//        lRepo.save(l);
//
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupAuteur();
        //setupLivre();
    }
}

