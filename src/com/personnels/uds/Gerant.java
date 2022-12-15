package com.personnels.uds;

import com.stock.uds.Fournisseur;

import java.util.ArrayList;
import java.util.List;

public class Gerant extends  Person {
    private double salaire;
    private String contrat;

    public Gerant(int id, String nom, String prenom, String email, String adresse, String tel, String password, double salaire, String contrat) {
        super(id, nom, prenom, email, adresse, tel, password);
        this.salaire = salaire;
        this.contrat = contrat;
    }

    public List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>();
    public void Connecter(String email, String password) {
    }
}
