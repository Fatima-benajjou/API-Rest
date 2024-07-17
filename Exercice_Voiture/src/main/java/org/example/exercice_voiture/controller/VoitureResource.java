package org.example.exercice_voiture.controller;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exercice_voiture.model.Voiture;
import org.example.exercice_voiture.service.VoitureService;

import java.util.ArrayList;
import java.util.List;

@Path("/voiture")
public class VoitureResource {

    private final VoitureService voitureService;
    @Inject
    public VoitureResource(VoitureService voitureService) {this.voitureService = voitureService;}

    List<Voiture> voitures = new ArrayList<>();


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voiture> getAllVoitures() {
        return voitureService.getAllVoiture();

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Voiture createVoiture(Voiture voiture) {
        return voitureService.create(1, "toyota",2000,"rouge");
    }

    @DELETE
    @Path("{id}")
    public int delete(@PathParam("id") int id) {return id;}
    

}
