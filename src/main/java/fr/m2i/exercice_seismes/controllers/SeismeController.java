package fr.m2i.exercice_seismes.controllers;

import fr.m2i.exercice_seismes.dtos.seismes.SeismeDTO;
import fr.m2i.exercice_seismes.dtos.seismes.SeismeDeleteDTO;
import fr.m2i.exercice_seismes.dtos.seismes.SeismeSaveDTO;
import fr.m2i.exercice_seismes.services.SeismeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/seismes")
public class SeismeController {

    private SeismeService service;

    public SeismeController(SeismeService seismeService) {
        this.service = seismeService;
    }


    /**
     * Route retournant une liste de séismes
     */


    @GetMapping()
    public List<SeismeDTO> getSeismes() {
        return service.findAll();
    }

    /**
     * Route menant à un seisme par son id
     */

    @GetMapping("{id}")
    public ResponseEntity<SeismeDTO> getSeisme(@PathVariable String id) {
        SeismeDTO seismeDTO = service.findById(id);
        if (seismeDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(seismeDTO);
    }

    /**
     * Route permattant la sauvegarde d'un seisme
     * @param seisme : le séisme à sauvegarder
     * @return un SeismeDTO
     */
    @PostMapping()
    public SeismeDTO saveSeisme(@RequestBody SeismeSaveDTO seisme) {
        return service.save(seisme);
    }

    /**
     * Route permettant la suppression d'un séisme avec son id
     * @param id l'id du séisme à supprimer
     */
    @DeleteMapping("{id}")
    public void deleteSeisme (@PathVariable String id) {
         this.service.delete(id);
    }


}