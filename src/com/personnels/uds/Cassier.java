package com.personnels.uds;

import com.transaction.uds.Vente;

public class Cassier extends Person {
    private float salaire;
    private String contrat;
    private Vente vente;

    public Cassier(int id, String nom, String prenom, String email, String adresse, String tel, String password, float salaire, String contrat) {
        super(id, nom, prenom, email, adresse, tel, password);
        this.salaire = salaire;
        this.contrat = contrat;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public void genererbilan() {
    }
}
