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

    public Collegue getCollegueByName(String name) {
        return collegueRepository.getCollegueByName(name);
    }
}
