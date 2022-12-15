package com.transaction.uds;

import com.personnels.uds.Client;
import com.personnels.uds.Pharmacien;

public class Ordonnance {

    private String identifiant;
    private Client client;
    private Pharmacien pharmacien;
    private String nomfic;
    private double poids;

    public Ordonnance(String identifiant, Client client, Pharmacien pharmacien, String nomfic, double poids) {
        this.identifiant = identifiant;
        this.client = client;
        this.pharmacien = pharmacien;
        this.nomfic = nomfic;
        this.poids = poids;
    }

    public void verifierOrdonnance() {
    }

    public void envoyerOrd() {
    }

    public void confirmeOperation() {
    }


    public void supprimerOrd() {
    }

    public void chercherOrd() {
    }

}
