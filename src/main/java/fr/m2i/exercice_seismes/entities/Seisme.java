package fr.m2i.exercice_seismes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Seisme {
    @Id
    String id;
    String nom;
    float magnitude;
    String date;

    @DBRef
    Pays pays;

    public Seisme() {
    }

    public Seisme(String id, String nom, float magnitude, Pays pays, String date) {
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
