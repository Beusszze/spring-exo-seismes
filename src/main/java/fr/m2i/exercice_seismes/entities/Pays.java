package fr.m2i.exercice_seismes.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Pays {
    String id;
    String name;
    String code;
    @DBRef
    List<Seisme> seismes;

    public Pays() {
    }

    public Pays(String id, String name, String code, List<Seisme> seismes) {
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
