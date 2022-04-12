package com.example.biblio.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Livre {
    private int idLivre;
    private String titreLivre;
    private String categorieLivre;
    private String isbnLivre;
    private String idExemplaireLivre;
}
