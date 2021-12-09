package fr.m2i.exercice_seismes.dtos.seismes;

import fr.m2i.exercice_seismes.dtos.pays.PaysDTO;
import fr.m2i.exercice_seismes.dtos.pays.PaysRelationDTO;

public class SeismeSaveDTO {
    private String nom;
    private float magnitude;
    private String date;
   private PaysRelationDTO pays;

    public SeismeSaveDTO() {
    }

    public SeismeSaveDTO(String nom, float magnitude, String date, PaysRelationDTO pays) {
        this.nom = nom;
        this.magnitude = magnitude;
        this.date = date;
        this.pays = pays;
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

    public PaysRelationDTO getPays() {
        return pays;
    }

    public void setPays(PaysRelationDTO pays) {
        this.pays = pays;
    }
}

