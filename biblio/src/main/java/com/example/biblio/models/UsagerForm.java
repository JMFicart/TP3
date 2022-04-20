package com.example.biblio.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class UsagerForm {
    private Long idUsager;
    @NotBlank(message="Le nom de l'usager ne peut être vide et doit avoir moins de 200 caractères !")
    @Size(min=1, max=200)
    private String nomUsager;
    @NotBlank(message="Le prénom de l'usager ne peut être vide et doit avoir moins de 200 caractères !")
    @Size(min=1, max=200)
    private String prenomUsager;
    @NotBlank(message="L'adresse de l'usager ne peut être vide et doit avoir moins de 200 caractères !")
    @Size(min=1, max=200)
    private String adresseUsager;
    @NotBlank(message="Le code postal de l'usager ne peut être vide et doit avoir moins de 20 caractères !")
    @Size(min=1, max=20)
    private String codepostalUsager;
    @NotBlank(message="La localité de l'usager ne peut être vide et doit avoir moins de 200 caractères !")
    @Size(min=1, max=200)
    private String localiteUsager;
    @NotBlank(message="Le téléphone de l'usager ne peut être vide et doit avoir moins de 20 caractères !")
    @Size(min=1, max=20)
    private String telephoneUsager;
    @NotBlank(message="L'email de l'usager ne peut être vide et doit avoir moins de 200 caractères !")
    @Size(min=1, max=200)
    private String emailUsager;
    @NotBlank(message="La date d'inscription de l'usager ne peut être vide !")
    private LocalDate dateInscriptionUsager;
    private LocalDate dateRadiationUsager;
}
