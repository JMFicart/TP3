package com.example.biblio.models.usager;

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
@Table(name = "usager")
public class Usager {
    @Id
    @Column(name = "idUsager", nullable = false)
    private Long idUsager;
    @Column(name = "nomUsager", nullable = false, length = 200)
    private String nomUsager;
    @Column(name = "prenomUsager", nullable = false, length = 200)
    private String prenomUsager;
    @Column(name = "adresseUsager", nullable = false, length = 200)
    private String adresseUsager;
    @Column(name = "codepostalUsager", nullable = false, length = 20)
    private String codepostalUsager;
    @Column(name = "localiteUsager", nullable = false, length = 200)
    private String localiteUsager;
    @Column(name = "telephoneUsager", nullable = false, length = 20)
    private String telephoneUsager;
    @Column(name = "emailUsager", nullable = false, length = 200)
    private String emailUsager;
    @Column(name = "dateInscriptionUsager", nullable = false)
    private LocalDate dateInscriptionUsager;
    @Column(name = "dateRadiationUsager", nullable = true)
    private LocalDate dateRadiationUsager;
}
