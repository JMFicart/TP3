package com.example.biblio.service;

import com.example.biblio.models.usager.Usager;
import com.example.biblio.models.usager.UsagerForm;
import com.example.biblio.repositories.UsagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsagerService {
    private Long nextIdUsager = 3L;
    private final UsagerRepository uRepo;

    public UsagerService(UsagerRepository uRepo) {
        this.uRepo = uRepo;
    }

    public Usager getOne(Long id){
        return uRepo.getById(id);
    }

    public List<Usager> getAll(){
        return uRepo.findAll();
    }

    public Usager insert(UsagerForm form){
        Usager usager = Usager.builder()
                .idUsager(++nextIdUsager)
                .nomUsager(form.getNomUsager())
                .prenomUsager(form.getPrenomUsager())
                .adresseUsager(form.getAdresseUsager())
                .codepostalUsager(form.getCodepostalUsager())
                .localiteUsager(form.getLocaliteUsager())
                .telephoneUsager(form.getTelephoneUsager())
                .emailUsager(form.getEmailUsager())
                .dateInscriptionUsager(form.getDateInscriptionUsager())
                .dateRadiationUsager(form.getDateRadiationUsager())
                .build();
        uRepo.save(usager);
        return usager;
    }

    public Usager update(UsagerForm form){
        Usager usager = Usager.builder()
                .idUsager(form.getIdUsager())
                .nomUsager(form.getNomUsager())
                .prenomUsager(form.getPrenomUsager())
                .adresseUsager(form.getAdresseUsager())
                .codepostalUsager(form.getCodepostalUsager())
                .localiteUsager(form.getLocaliteUsager())
                .telephoneUsager(form.getTelephoneUsager())
                .emailUsager(form.getEmailUsager())
                .dateInscriptionUsager(form.getDateInscriptionUsager())
                .dateRadiationUsager(form.getDateRadiationUsager())
                .build();
        uRepo.save(usager);
        return usager;
    }
}
