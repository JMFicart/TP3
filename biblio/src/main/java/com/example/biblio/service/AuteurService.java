package com.example.biblio.service;

import com.example.biblio.models.auteur.Auteur;
import com.example.biblio.models.auteur.AuteurForm;
import com.example.biblio.repositories.AuteurRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuteurService {
    private Long nextIdAuteur = 5L;
    private final AuteurRepository aRepo;

    public AuteurService(AuteurRepository aRepo) {
        this.aRepo = aRepo;
    }

    public Auteur getOne(Long id){
        return aRepo.getById(id);
    }

    public List<Auteur> getAll(){
        return aRepo.findAll();
    }

    public Auteur insert(AuteurForm form){
        Auteur auteur = Auteur.builder()
                .idAuteur(++nextIdAuteur)
                .nomAuteur(form.getNomAuteur())
                .nationaliteAuteur(form.getNationaliteAuteur())
                .build();
        aRepo.save(auteur);
        return auteur;
    }

    public Auteur update(AuteurForm form){
        Auteur auteur = Auteur.builder()
                .idAuteur(form.getIdAuteur())
                .nomAuteur(form.getNomAuteur())
                .nationaliteAuteur(form.getNationaliteAuteur())
                .build();
        aRepo.save(auteur);
        return auteur;
    }
}
