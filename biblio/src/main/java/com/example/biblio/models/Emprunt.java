package com.example.biblio.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Builder
public class Emprunt {
    private int idEmprunt;
    private int idLivre;
    private int idEmprunteur;
    private LocalDate dateEmpruntLivre;
    private LocalDate dateRentreePrevue;
}
