package com.example.biblio.models;

import lombok.*;
import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "auteur")
public class Auteur {
    @Id
    @Column(name = "idAuteur", nullable = false)
    private int idAuteur;
    @Column(name = "nomAuteur", nullable = false, length = 200)
    private String nomAuteur;
    @Column(name = "nationaliteAuteur", nullable = false, length = 50)
    private String nationaliteAuteur;
}



