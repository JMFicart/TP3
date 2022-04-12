package com.example.biblio.models;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;

@Data
@Builder
public class Auteur {
    private int idAuteur;
    private String nomAuteur;
    private String nationaliteAuteur;
}
