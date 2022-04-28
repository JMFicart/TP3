package com.example.biblio.models.livre;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "livre")
public class Livre {
    @Id
    @Column(name = "idLivre", nullable = false)
    private Long idLivre;
    @Column(name = "titreLivre", nullable = false, length = 200)
    private String titreLivre;
    @Column(name = "categorieLivre", nullable = false, length = 50)
    private String categorieLivre;
    @Column(name = "isbnLivre", nullable = false, length = 50)
    private String isbnLivre;
    @Column(name = "idExemplaireLivre", nullable = false, length = 50)
    private String idExemplaireLivre;
    @Column(name = "idAuteur", nullable = false)
    private Long idAuteur;
}
