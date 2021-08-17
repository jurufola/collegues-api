package home.jurufola.colleguesapi.controllers;

import home.jurufola.colleguesapi.entities.Collegue;
import home.jurufola.colleguesapi.exceptions.CollegueNonTrouveException;
import home.jurufola.colleguesapi.services.CollegueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@ControllerAdvice
@RestController
public class CollegueController {
    @Autowired
    CollegueService collegueService;

    /**
     * Ajoute une collègue dans la Base
     * @param collegue
     * @return
     */
    @PostMapping("collegues")
    public String addCollegue(@RequestBody Collegue collegue) {

        return collegueService.addCollegue(collegue);
    }


    /**
     * Retoune un liste matricules correpondant au nom passé en paramètre de la requète
     * /collegues?nom=XXX
     * @param nom
     * @return
     */
    @GetMapping("collegues")
    public List<String> getMatriculesByName(@RequestParam String nom) {

        return collegueService.getMatriculesByName(nom);
    }

    /**
     * Retourne un collegue par matricule
     * Si collegue non trouvé une exception est levée
     * @param matricule
     * @return
     */
    @GetMapping("collegues/{matricule}")
    public Collegue getCollegueByMatricule(@PathVariable("matricule") String matricule) {
        Collegue collegue = collegueService.getCollegueByMatricule(matricule);
        if (collegue == null) throw new CollegueNonTrouveException();
        return collegue;
    }
    @GetMapping("collegues/{nom}")
    public String getStaticName(@PathVariable("nom") String nom) {
        return "Collegue de nom static"+nom;
    }

    /**
     * ceci est un test
     * @param prenom
     * @return
     */
    @GetMapping("colleguesTest/{prenom}")
    public void testRoute(@PathVariable("prenom") String prenom) {
        System.out.println(prenom);

    }

}
