package com.example.biblio.models.usager;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class UsagerFormId {
    private Long idUsager;
    @Size(min=1, max=200)
    private String nomUsager;
    @Size(min=1, max=200)
    private String prenomUsager;
    @Size(min=1, max=200)
    private String adresseUsager;
    @Size(min=1, max=20)
    private String codepostalUsager;
    @Size(min=1, max=200)
    private String localiteUsager;
    @Size(min=1, max=20)
    private String telephoneUsager;
    @Size(min=1, max=200)
    private String emailUsager;
    private LocalDate dateInscriptionUsager;
    private LocalDate dateRadiationUsager;
}
