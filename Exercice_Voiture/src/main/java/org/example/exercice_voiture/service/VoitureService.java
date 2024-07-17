package org.example.exercice_voiture.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exercice_voiture.model.Voiture;

import java.util.List;

@ApplicationScoped
public class VoitureService {
    private Voiture voiture;
    private List<Voiture> voitures;

    public Voiture create (int id, String marque, int anneeFab, String Couleur) {
        return new Voiture(id, marque, anneeFab, Couleur);
    }

    public Voiture save (int id, String marque, int anneeFab, String Couleur) {
        return new Voiture(id, marque, anneeFab, Couleur);
    }

    public List<Voiture> getAllVoiture() {
        return voitures;
    }


}
