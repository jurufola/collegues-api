package home.jurufola.colleguesapi.repositories;

import home.jurufola.colleguesapi.entities.Collegue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Repository pour l'acces aux données des collègues
 * @author juruf_000
 */
public interface CollegueRepository extends JpaRepository<Collegue, Long> {
    Collegue findByNom(String nom);
    @Query("SELECT matricule FROM Collegue c Where c.nom=:name")
    List<String> getMatriculesByName(String name);

    Collegue findByMatricule(String matricule);
}
