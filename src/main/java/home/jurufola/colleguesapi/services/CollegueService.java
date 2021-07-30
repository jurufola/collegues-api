package home.jurufola.colleguesapi.services;

import home.jurufola.colleguesapi.entities.Collegue;
import home.jurufola.colleguesapi.repositories.CollegueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Classe de Service pour la gestion des collègues
 * @author juruf_000
 */
@Service
public class CollegueService {
    @Autowired
    CollegueRepository collegueRepository;

    /**
     * Récupere un collegue dans la base à partir de son nom
     * @param nom Le nom du collègue
     * @return
     */
    public Collegue getCollegueByName(String nom) {
        return collegueRepository.findByNom(nom);


    }

    public String addCollegue(Collegue collegue) {
        collegueRepository.save(collegue);
        return "Ajout Collègue OK";
    }
}
