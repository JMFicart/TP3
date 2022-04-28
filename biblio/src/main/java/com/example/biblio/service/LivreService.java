package com.example.biblio.service;

import com.example.biblio.models.livre.Livre;
import com.example.biblio.models.livre.LivreForm;
import com.example.biblio.repositories.LivreRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LivreService {
    private Long nextIdLivre = 5L;
    private final LivreRepository lRepo;

    public LivreService(LivreRepository lRepo) {
        this.lRepo = lRepo;
    }

    public Livre getOne(Long id){
        return lRepo.getById(id);
    }

    public List<Livre> getAll(){
        return lRepo.findAll();
    }

    public Livre insert(LivreForm form){
        Livre livre = Livre.builder()
                .idLivre(++nextIdLivre)
                .titreLivre(form.getTitreLivre())
                .categorieLivre(form.getCategorieLivre())
                .isbnLivre(form.getIsbnLivre())
                .idExemplaireLivre(form.getIdExemplaireLivre())
                .idAuteur(form.getIdAuteur())
                .build();
        lRepo.save(livre);
        return livre;
    }

    public Livre update(LivreForm form){
        Livre livre = Livre.builder()
                .idLivre(form.getIdLivre())
                .titreLivre(form.getTitreLivre())
                .categorieLivre(form.getCategorieLivre())
                .isbnLivre(form.getIsbnLivre())
                .idExemplaireLivre(form.getIdExemplaireLivre())
                .idAuteur(form.getIdAuteur())
                .build();
        lRepo.save(livre);
        return livre;
    }
}
