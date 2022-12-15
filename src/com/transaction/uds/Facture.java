package com.transaction.uds;

public class Facture {
    public String nom;
    public String adresse;
    public String tel;

    public Facture(String nom, String adresse, String tel) {
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
