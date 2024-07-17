package org.example.exercice_voiture.model;

public class Voiture {

    private int id;
    private String marque;
    private int anneeFab;
    private String couleur;

    public Voiture() {
    }

    public Voiture(int id, String marque, int anneeFab, String couleur) {
        this.id = id;
        this.marque = marque;
        this.anneeFab = anneeFab;
        this.couleur = couleur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getAnneeFab() {
        return anneeFab;
    }

    public void setAnneeFab(int anneeFab) {
        this.anneeFab = anneeFab;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}


