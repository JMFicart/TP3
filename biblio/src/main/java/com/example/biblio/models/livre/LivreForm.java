package com.example.biblio.models.livre;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LivreForm {
    private Long idLivre;
    @NotBlank(message="Le titre du livre ne peut être vide et doit avoir moins de 200 caractères !")
    @Size(min=1, max=200)
    private String titreLivre;
    @NotBlank(message="La catégorie du livre ne peut être vide et doit avoir moins de 50 caractères !")
    @Size(min=1, max=50)
    private String categorieLivre;
    @NotBlank(message="L'ISBN du livre ne peut être vide et doit avoir moins de 50 caractères !")
    @Size(min=1, max=50)
    private String isbnLivre;
    @NotBlank(message="Le numéro de l'exemplaire du livre ne peut être vide et doit avoir moins de 50 caractères !")
    @Size(min=1, max=50)
    private String idExemplaireLivre;
    private Long idAuteur;
}
