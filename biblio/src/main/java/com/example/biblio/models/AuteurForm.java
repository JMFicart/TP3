package com.example.biblio.models;


import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class AuteurForm {
    @NotBlank(message="Le nom de l'auteur ne peut être vide !")
    @Size(min=1, max=200)
    private String nomAuteur;
    @NotBlank(message="La nationalité de l'auteur ne peut être vide !")
    @Size(min=1, max=50)
    private String nationaliteAuteur;
}