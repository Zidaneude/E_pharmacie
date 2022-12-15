package com.stock.uds;

import com.personnels.uds.Gerant;

public class Fournisseur {
    private String nom;
    private String adresse;
    private String tel;
    private Gerant gerant ;

    public Fournisseur(String nom, String adresse, String tel) {
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
