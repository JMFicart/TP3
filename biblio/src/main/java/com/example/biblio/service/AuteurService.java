package com.example.biblio.service;

import com.example.biblio.models.Auteur;
import com.example.biblio.models.AuteurForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuteurService {
    private final List<Auteur> auteurs;
    private int nextIdAuteur = 5;

    public AuteurService() {
        auteurs = new ArrayList<>();
        auteurs.add(Auteur.builder()
                        .idAuteur(1)
                        .nomAuteur("Jules Verne")
                        .nationaliteAuteur("France")
                        .build());

        auteurs.add(Auteur.builder()
                        .idAuteur(2)
                        .nomAuteur("Jack Vance")
                        .nationaliteAuteur("USA")
                        .build());

        auteurs.add(Auteur.builder()
                        .idAuteur(3)
                        .nomAuteur("Frank Herbert")
                        .nationaliteAuteur("USA")
                        .build());

        auteurs.add(Auteur.builder()
                        .idAuteur(4)
                        .nomAuteur("Arthur C Clark")
                        .nationaliteAuteur("GB")
                        .build());
    }

    public Auteur getOne(int id){
        return auteurs.stream().filter(e -> e.getIdAuteur() == id)
                .findFirst()
                .orElseThrow();
    }

    public Auteur getNom(String n){
        return auteurs.stream().filter(e -> e.getNomAuteur().equals(n) )
                .findFirst()
                .orElseThrow();
    }

    public List<Auteur> getPays(String p){
        return auteurs.stream().filter(e -> e.getNationaliteAuteur().equals(p) )
                .toList();
    }

    public List<Auteur> getAll(){
        return new ArrayList<Auteur>(auteurs);
    }

    public Auteur insert(AuteurForm form){
        Auteur auteur = Auteur.builder()
                .idAuteur(++nextIdAuteur)
                .nomAuteur(form.getNomAuteur())
                .nationaliteAuteur(form.getNationaliteAuteur())
                .build();
        auteurs.add(auteur);
        return auteur;
    }
}
