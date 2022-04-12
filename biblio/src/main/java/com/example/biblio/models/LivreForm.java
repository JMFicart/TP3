package com.example.biblio.models;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LivreForm {
    @NotBlank(message="Le titre du livre ne peut être vide !")
    @Size(min=1, max=200)
    private String titreLivre;
    @NotBlank(message="La catégorie du livre ne peut être vide !")
    @Size(min=1, max=50)
    private String categorieLivre;
    @NotBlank(message="L'ISBN du livre ne peut être vide !")
    @Size(min=1, max=20)
    private String isbnLivre;
    @NotBlank(message="Le numero d'exemplaire du livre ne peut être vide !")
    @Size(min=1, max=20)
    private String idExemplaireLivre;
}
