package fr.m2i.exercice_seismes.dtos.seismes;

import fr.m2i.exercice_seismes.entities.Pays;

public class SeismeDTO {
    String id;
    String nom;
    float magnitude;
    String date;

    Pays pays;

    public SeismeDTO() {
    }

    public SeismeDTO(String id, String nom, float magnitude, Pays pays, String date) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.pays = pays;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
