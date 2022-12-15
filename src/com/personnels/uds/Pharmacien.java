package com.personnels.uds;

import com.transaction.uds.Ordonnance;

import java.util.ArrayList;
import java.util.List;

public class Pharmacien extends Person {
    public Pharmacien(int id, String nom, String prenom, String email, String adresse, String tel, String password, List<Ordonnance> ordonnances) {
        super(id, nom, prenom, email, adresse, tel, password);
        this.ordonnances = ordonnances;
    }

    public List<Ordonnance> ordonnances = new ArrayList<Ordonnance>();
    public void donner_avis() {
    }

    public void  connecter() {
    }
}
