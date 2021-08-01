package home.jurufola.colleguesapi.controllers;

import home.jurufola.colleguesapi.entities.Collegue;
import home.jurufola.colleguesapi.services.CollegueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * Retoune un liste matrcules correpondant au nom passé en paramètre de la requète
     * /collegues?nom=XXX
     * @param nom
     * @return
     */
    @GetMapping("collegues")
    public List<String> getMatriculesByName(@RequestParam String nom) {

        return collegueService.getMatriculesByName(nom);
    }

    @GetMapping("collegues/{matricule}")
    public Collegue getCollegueByMatricule(@PathVariable("matricule") String matricule) {
        System.out.println("Je suis dans getCollegueByMatricule -> " + matricule);
        return collegueService.getCollegueByMatricule(matricule);
    }


}
