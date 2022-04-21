package com.example.biblio.utils;

import com.example.biblio.models.Auteur;
import com.example.biblio.models.Emprunt;
import com.example.biblio.models.Livre;
import com.example.biblio.models.Usager;
import com.example.biblio.repositories.AuteurRepository;
import com.example.biblio.repositories.EmpruntRepository;
import com.example.biblio.repositories.LivreRepository;
import com.example.biblio.repositories.UsagerRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.time.LocalDate;

@Component
public class DatabaseFiller implements InitializingBean{
    private final AuteurRepository aRepo;
    private final LivreRepository lRepo;
    private final UsagerRepository uRepo;
    private final EmpruntRepository eRepo;

    public DatabaseFiller(AuteurRepository aRepo, LivreRepository lRepo, UsagerRepository uRepo, EmpruntRepository eRepo) {
        this.aRepo = aRepo;
        this.lRepo = lRepo;
        this.uRepo = uRepo;
        this.eRepo = eRepo;
    }

    private void setupAuteur(){
        Auteur a = Auteur.builder()
                .idAuteur(1L)
                .nomAuteur("Jules Verne")
                .nationaliteAuteur("France")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(2L)
                .nomAuteur("Jack Vance")
                .nationaliteAuteur("USA")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(3L)
                .nomAuteur("Frank Herbert")
                .nationaliteAuteur("USA")
                .build();
        aRepo.save(a);

        a = Auteur.builder()
                .idAuteur(4L)
                .nomAuteur("Arthur C Clarke")
                .nationaliteAuteur("GB")
                .build();
        aRepo.save(a);
    }

    private void setupLivre(){
        Livre l = Livre.builder()
                .idLivre(1L)
                .titreLivre("Voyage au centre de la Terre")
                .categorieLivre("Aventure")
                .isbnLivre("156-454554-9899")
                .idExemplaireLivre("BGT-985")
                .idAuteur(1L)
                .build();
        lRepo.save(l);

        l = Livre.builder()
                .idLivre(2L)
                .titreLivre("Un monde d'azur")
                .categorieLivre("Science-fiction")
                .isbnLivre("896-658947-3694")
                .idExemplaireLivre("SDE-156")
                .idAuteur(2L)
                .build();
        lRepo.save(l);

        l = Livre.builder()
                .idLivre(3L)
                .titreLivre("Dune")
                .categorieLivre("Science-fiction")
                .isbnLivre("489-453289-9712")
                .idExemplaireLivre("AGT-186")
                .idAuteur(3L)
                .build();
        lRepo.save(l);

        l = Livre.builder()
                .idLivre(4L)
                .titreLivre("L'affaire Saint Fiacre")
                .categorieLivre("Policier")
                .isbnLivre("854-364895-1496")
                .idExemplaireLivre("KIO-658")
                .idAuteur(4L)
                .build();
        lRepo.save(l);
    }

    private void setupUsager(){
        Usager u = Usager.builder()
                .idUsager(1L)
                .nomUsager("Dupont")
                .prenomUsager("Jules")
                .adresseUsager("Rue du commerce, 38")
                .codepostalUsager("5000")
                .localiteUsager("Namur")
                .telephoneUsager("0489/658294")
                .emailUsager("jules.dupont@gmail.com")
                .dateInscriptionUsager(LocalDate.now().minusYears(2))
//                .dateRadiationUsager("")
                .build();
        uRepo.save(u);

        u = Usager.builder()
                .idUsager(2L)
                .nomUsager("Cutugno")
                .prenomUsager("Toto")
                .adresseUsager("Avenue Jean Materne, 52")
                .codepostalUsager("5100")
                .localiteUsager("Jambes")
                .telephoneUsager("0472/934812")
                .emailUsager("t.cutugno@gmail.com")
                .dateInscriptionUsager(LocalDate.now().minusYears(1))
                .build();
        uRepo.save(u);

        u = Usager.builder()
                .idUsager(3L)
                .nomUsager("Alphabete")
                .prenomUsager("Anne")
                .adresseUsager("Avenue Cardinal Mercier, 18")
                .codepostalUsager("5000")
                .localiteUsager("Namur")
                .telephoneUsager("0471/648525")
                .emailUsager("a.alphabete@gmail.com")
                .dateInscriptionUsager(LocalDate.now().minusYears(3))
//                .dateRadiationUsager("")
                .build();
        uRepo.save(u);
    }

    private void setupEmprunt(){
        Emprunt e = Emprunt.builder()
                .idEmprunt(1L)
                .idLivre(1L)
                .idUsager(1L)
                .dateEmpruntLivre(LocalDate.now().minusDays(2))
                .dateRentreePrevueLivre(LocalDate.now().plusDays(28))
                .build();
        eRepo.save(e);

        e = Emprunt.builder()
                .idEmprunt(2L)
                .idLivre(2L)
                .idUsager(2L)
                .dateEmpruntLivre(LocalDate.now().minusDays(15))
                .dateRentreePrevueLivre(LocalDate.now().plusDays(15))
                .build();
        eRepo.save(e);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupAuteur();
        setupLivre();
        setupUsager();
        setupEmprunt();
    }
}
