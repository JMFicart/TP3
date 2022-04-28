package com.example.biblio.service;

import com.example.biblio.models.emprunt.Emprunt;
import com.example.biblio.models.emprunt.EmpruntForm;
import com.example.biblio.repositories.EmpruntRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpruntService {
    private Long nextIdEmprunt = 3L;
    private final EmpruntRepository eRepo;

    public EmpruntService(EmpruntRepository eRepo) {
        this.eRepo = eRepo;
    }

    public Emprunt getOne(Long id){
        return eRepo.getById(id);
    }

    public List<Emprunt> getAll(){
        return eRepo.findAll();
    }

    public Emprunt insert(EmpruntForm form){
        Emprunt emprunt = Emprunt.builder()
                .idEmprunt(++nextIdEmprunt)
                .idUsager(form.getIdUsager())
                .idLivre(form.getIdLivre())
                .dateEmpruntLivre(form.getDateEmpruntLivre())
                .dateRentreePrevueLivre(form.getDateRentreePrevueLivre())
                .build();
        eRepo.save(emprunt);
        return emprunt;
    }

    public Emprunt update(EmpruntForm form){
        Emprunt emprunt = Emprunt.builder()
                .idUsager(form.getIdUsager())
                .idLivre(form.getIdLivre())
                .dateEmpruntLivre(form.getDateEmpruntLivre())
                .dateRentreePrevueLivre(form.getDateRentreePrevueLivre())
                .build();
        eRepo.save(emprunt);
        return emprunt;
    }
}
