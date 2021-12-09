package fr.m2i.exercice_seismes.controllers;

import fr.m2i.exercice_seismes.dtos.pays.PaysDTO;
import fr.m2i.exercice_seismes.dtos.pays.PaysSaveDTO;
import fr.m2i.exercice_seismes.services.PaysService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pays")
public class PaysController {

    private PaysService service;

    public PaysController(PaysService service) {
        this.service = service;
    }

    /**
     * Route menant à tous les pays
     */
    @GetMapping()
    public List<PaysDTO> getPays() {
        return service.findALl();
    }

    /**
     * Route affichant un pays selon l'id renseigné
     */
    @GetMapping("{id}")
    public ResponseEntity<PaysDTO> getPays (@PathVariable String id) {
        PaysDTO paysDTO = service.findById(id);
        if (paysDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(paysDTO);
    }

    /**
     * Route permettant la sauvegarde d'un pays en bdd
     */
    @PostMapping
    public PaysDTO savePays (@RequestBody PaysSaveDTO pays) {
        return this.service.save(pays);
    }

    /**
     * Route permettant la suppression d'un pays avec son id
     * @param id l'id du pays à supprimé
     */
    @DeleteMapping("{id}")
    public void deletePays (@PathVariable String id) {
        this.service.delete(id);
    }

}
