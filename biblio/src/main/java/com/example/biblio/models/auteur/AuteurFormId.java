package com.example.biblio.models.auteur;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class AuteurFormId {
//    @NotBlank(message="Le nom de l'auteur ne peut être vide et doit avoir moins de 200 caractères !")
//    @Size(min=1, max=200)
    private Long idAuteur;
    @Size(min=1, max=200)
    private String nomAuteur;
    @Size(min=1, max=50)
    private String nationaliteAuteur;
}
