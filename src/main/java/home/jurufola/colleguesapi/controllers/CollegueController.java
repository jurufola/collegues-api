package home.jurufola.colleguesapi.controllers;

import home.jurufola.colleguesapi.entities.Collegue;
import home.jurufola.colleguesapi.services.CollegueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("collegues")
    public Collegue getCollegueByName(@RequestParam String nom) {
        System.out.println(nom);
        System.out.println(collegueService.getCollegueByName(nom));
        return collegueService.getCollegueByName(nom);
    }

    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }


}
