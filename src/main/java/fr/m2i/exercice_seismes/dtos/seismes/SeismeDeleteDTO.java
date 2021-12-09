package fr.m2i.exercice_seismes.dtos.seismes;

import fr.m2i.exercice_seismes.dtos.pays.PaysDTO;

public class SeismeDeleteDTO {
    private String id;


    public SeismeDeleteDTO() {
    }

    public SeismeDeleteDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

