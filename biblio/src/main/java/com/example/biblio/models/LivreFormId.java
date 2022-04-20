package com.example.biblio.models;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@Data
public class LivreFormId {
    private Long idLivre;
    @Size(min=1, max=200)
    private String titreLivre;
    @Size(min=1, max=50)
    private String categorieLivre;
    @Size(min=1, max=50)
    private String isbnLivre;
    @Size(min=1, max=50)
    private String idExemplaireLivre;
    private Long idAuteur;
}
