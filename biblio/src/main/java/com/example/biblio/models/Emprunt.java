package com.example.biblio.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @Column(name = "idEmprunt", nullable = false)
    private Long idEmprunt;
    @Column(name = "idLivre", nullable = false)
    private Long idLivre;
    @Column(name = "idUsager", nullable = false)
    private Long idUsager;
    @Column(name = "dateEmpruntLivre", nullable = false)
    private LocalDate dateEmpruntLivre;
    @Column(name = "dateRentreePrevueLivre", nullable = false)
    private LocalDate dateRentreePrevueLivre;
}
