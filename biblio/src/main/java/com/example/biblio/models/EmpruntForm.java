package com.example.biblio.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
public class EmpruntForm {
    private Long idEmprunt;
    @NotBlank(message="Le livre ne peut être vide !")
    private Long idLivre;
    @NotBlank(message="L'usager ne peut être vide !")
    private Long idUsager;
    @NotBlank(message="La date d'emprunt du livre ne peut être vide !")
    private LocalDate dateEmpruntLivre;
    private LocalDate dateRentreePrevueLivre;
}
