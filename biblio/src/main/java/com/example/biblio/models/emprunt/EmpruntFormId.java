package com.example.biblio.models.emprunt;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmpruntFormId {
    private Long idEmprunt;
    private Long idLivre;
    private Long idUsager;
    private LocalDate dateEmpruntLivre;
    private LocalDate dateRentreePrevueLivre;
}
