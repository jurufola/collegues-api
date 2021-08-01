package home.jurufola.colleguesapi.controllers;

import home.jurufola.colleguesapi.entities.Collegue;
import home.jurufola.colleguesapi.services.CollegueService;
import org.apache.catalina.LifecycleState;
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

    /*@GetMapping("collegues")
    public Collegue getCollegueByName(@RequestParam String nom) {
        System.out.println(nom);
        System.out.println(collegueService.getCollegueByName(nom));
        return collegueService.getCollegueByName(nom);
    }*/

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

    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }


}
