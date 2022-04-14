package com.example.biblio.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class AuteurFormId {
//    @NotBlank(message="Le nom de l'auteur ne peut être vide et doit avoir moins de 200 caractères !")
//    @Size(min=1, max=200)
    private String idAuteur;
}
