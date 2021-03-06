package fr.m2i.exercice_seismes.dtos.seismes;

import fr.m2i.exercice_seismes.dtos.pays.PaysDTO;
import fr.m2i.exercice_seismes.entities.Pays;

public class SeismeDTO {
    private String id;
    private String nom;
    private float magnitude;
    private String date;

   private  PaysDTO pays;

    public SeismeDTO() {
    }

    public SeismeDTO(String id, String nom, float magnitude, String date, PaysDTO pays) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.date = date;
        this.pays = pays;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PaysDTO getPays() {
        return pays;
    }

    public void setPays(PaysDTO pays) {
        this.pays = pays;
    }
}

