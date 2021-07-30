package home.jurufola.colleguesapi.repositories;

import home.jurufola.colleguesapi.entities.Collegue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository pour l'acces aux données des collègues
 * @author juruf_000
 */
public interface CollegueRepository extends JpaRepository<Collegue, Long> {
    Collegue getCollegueByName(String name);
}
