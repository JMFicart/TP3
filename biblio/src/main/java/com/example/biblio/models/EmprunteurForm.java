package com.example.biblio.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class EmprunteurForm {
    @NotBlank(message="Le nom de l'emprunteur ne peut être vide !")
    @Size(min=1, max=200)
    private String nomEmprunteur;
    @NotBlank(message="Le prénom de l'emprunteur ne peut être vide !")
    @Size(min=1, max=200)
    private String prenomEmprunteur;
    @NotBlank(message="L'adresse de l'emprunteur ne peut être vide !")
    @Size(min=1, max=200)
    private String adresseEmprunteur;
    @NotBlank(message="Le code postal de l'emprunteur ne peut être vide !")
    @Size(min=1, max=5)
    private String codePostalEmprunteur;
    @NotBlank(message="La localité de l'emprunteur ne peut être vide !")
    @Size(min=1, max=200)
    private String LocaliteEmprunteur;
    @Size(min=1, max=20)
    private String telephoneEmprunteur;
    @Size(min=1, max=200)
    private String emailEmprunteur;
    @NotBlank(message="Le titre du livre ne peut être vide !")
    private LocalDate dateInscriptionEmprunteur;
    @NotBlank(message="Le titre du livre ne peut être vide !")
    private LocalDate dateRadiationEmprunteur;
}
