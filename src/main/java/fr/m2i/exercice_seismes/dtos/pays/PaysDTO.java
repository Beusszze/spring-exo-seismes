package fr.m2i.exercice_seismes.dtos.pays;

import fr.m2i.exercice_seismes.entities.Seisme;

import java.util.List;

public class PaysDTO {
    String id;
    String name;
    String code;
    List<Seisme> seismes;

    public PaysDTO() {
    }

    public PaysDTO(String id, String name, String code, List<Seisme> seismes) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.seismes = seismes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Seisme> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<Seisme> seismes) {
        this.seismes = seismes;
    }
}
