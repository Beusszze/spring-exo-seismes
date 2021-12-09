package fr.m2i.exercice_seismes.services;

import fr.m2i.exercice_seismes.dtos.pays.PaysDTO;
import fr.m2i.exercice_seismes.dtos.pays.PaysSaveDTO;
import fr.m2i.exercice_seismes.dtos.pays.PaysUpdateDTO;
import fr.m2i.exercice_seismes.entities.Pays;
import fr.m2i.exercice_seismes.repositories.PaysRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaysService {

    @Autowired
    private PaysRepository paysRepository;
    @Autowired
    private ModelMapper mapper;

    /**
     * Méthode renvoyant la liste des pays enregistrés en bdd
     * @return liste des pays
     */
    public List<PaysDTO> findALl() {
        List<PaysDTO> payss = new ArrayList<>();
        paysRepository.findAll().forEach(pays -> {
            payss.add(mapper.map(pays, PaysDTO.class));
        });
        return payss;
    }

    /**
     * Méthode permettant de trouver un pays par son id
     * @param id l'id du pays
     * @return le pays s'il existe, sinon null
     */
    public PaysDTO findById(String id) {
        Optional<Pays> pays = paysRepository.findById(id);
        PaysDTO paysDTO = null;
        if (pays.isPresent()) {
            paysDTO = mapper.map(pays, PaysDTO.class);
        }
        return paysDTO;
    }

    /**
     * Méthode permattant la sauvegarde d'un pays en bdd
     * @param pays : le pays à sauvegarder
     * @return le pays sauvegardé
     */
    public PaysDTO save(PaysSaveDTO pays) {
        Pays paysToSAve = mapper.map(pays, Pays.class);
        Pays pays1 = paysRepository.save(paysToSAve);
        PaysDTO paysSaved = mapper.map(pays1, PaysDTO.class);
        return paysSaved;
    }


    /**
     * Méthode permattant la mise à jour d'un pays
     * @param pays le pays à mettre à jour
     * @return le pays mis à jour
     */
    public PaysDTO update (PaysUpdateDTO pays) {
        Pays paysToSave = mapper.map(pays, Pays.class);
        Pays pays1 = paysRepository.save(paysToSave);
        PaysDTO paysSaved = mapper.map(pays1, PaysDTO.class);
        return paysSaved;
    }

    /**
     * Méthode permettant la suppression d'un pays
     * @param id : l'id du pays à supprimer de la bdd
     */
    public void delete (String id) {
        Optional<Pays> pays = paysRepository.findById(id);
        if (pays.isPresent()) {
            Pays pays1 = mapper.map(pays, Pays.class);
            paysRepository.delete(pays1);
        }
    }


}
