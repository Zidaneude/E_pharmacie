package com.personnels.uds;

import com.transaction.uds.Commande;
import com.transaction.uds.Ordonnance;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {

        private int pointdefidelite;
        private List<Ordonnance> ordonnance = new ArrayList<Ordonnance> ();
        private List<Commande> commande = new ArrayList<Commande> ();

        public Client(int id, String nom, String prenom, String email, String adresse, String tel, String password, int pointdefidelite) {
                super(id, nom, prenom, email, adresse, tel, password);
                this.pointdefidelite = pointdefidelite;
        }
}
