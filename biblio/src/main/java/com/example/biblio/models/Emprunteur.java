package com.example.biblio.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Emprunteur {
    private int idEmprunteur;
    private String nomEmprunteur;
    private String prenomEmprunteur;
    private String adresseEmprunteur;
    private String codePostalEmprunteur;
    private String LocaliteEmprunteur;
    private String telephoneEmprunteur;
    private String emailEmprunteur;
    private LocalDate dateInscriptionEmprunteur;
    private LocalDate dateRadiationEmprunteur;
}
