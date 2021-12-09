package fr.m2i.exercice_seismes.services;

import fr.m2i.exercice_seismes.dtos.seismes.SeismeDTO;
import fr.m2i.exercice_seismes.dtos.seismes.SeismeDeleteDTO;
import fr.m2i.exercice_seismes.dtos.seismes.SeismeSaveDTO;
import fr.m2i.exercice_seismes.dtos.seismes.SeismeUpdateDTO;
import fr.m2i.exercice_seismes.entities.Seisme;
import fr.m2i.exercice_seismes.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SeismeService {

    @Autowired
    private SeismeRepository repo;
    @Autowired
    private ModelMapper mapper;


    /**
     * Méthode renvoyant la liste des séismes enregistrés en bdd
     * @return la liste des séismes enregistrés
     */
    public List<SeismeDTO> findAll() {
        List<SeismeDTO> seismes = new ArrayList<>();
        repo.findAll().forEach(seisme -> {
            seismes.add(mapper.map(seisme, SeismeDTO.class));
        });
        return seismes;
    }


     /** Méthode permettant de trouver un séisme par son id
     * @param id : l'id du séisme à rechercher
     * @return le séisme correspondant à l'id s'il existe
      *        sinon null
     */

    public SeismeDTO findById(String id) {
        Optional<Seisme> seisme = repo.findById(id);
        SeismeDTO seismeDTO = null;
        if (seisme.isPresent()) {
            seismeDTO = mapper.map(seisme, SeismeDTO.class);
        }
        return seismeDTO;
    }


    /**
     * Méthode permettant la sauvegarde d'un séisme en bdd
     * @param seisme : le séisme à sauvegarder
     * @return le séisme sauvegardé
     */
    public SeismeDTO save(SeismeSaveDTO seisme) {
            Seisme seismeToSave = mapper.map(seisme, Seisme.class);
            Seisme seisme1 = repo.save(seismeToSave);
            SeismeDTO seismeSaved = mapper.map(seisme1, SeismeDTO.class);
            return seismeSaved;
    }



    /**
     * Méthode permettant de mettre un jour un séisme
     * @param seisme le séisme à mettre à jour
     * @return le seisme mis à jour
     */

    public SeismeDTO update (SeismeUpdateDTO seisme) {
            Seisme seismeToSave = mapper.map(seisme, Seisme.class);
            Seisme seisme2 = repo.save(seismeToSave);
            SeismeDTO seismeSaved = mapper.map(seisme2, SeismeDTO.class);
            return seismeSaved;
    }


    /**
     * Méthode permettant la suppression d'un séisme en base de données
     * @param id l'id du séisme à supprimer
     */

    public void delete (String id) {
        Optional<Seisme> seisme = repo.findById(id);
        if(seisme.isPresent()){
            Seisme seisme1 = mapper.map(seisme, Seisme.class);
            repo.delete(seisme1);
        }
    }
}


