package com.transaction.uds;

import java.util.Date;

public class Vente {
    private String referene;
    private Date date_vente;
    private double prix_total;
    private Commande commande ;

    public Vente(String referene, Date date_vente, double prix_total) {
        this.referene = referene;
        this.date_vente = date_vente;
        this.prix_total = prix_total;
    }

    public String getReferene() {
        return referene;
    }

    public void setReferene(String referene) {
        this.referene = referene;
    }

    public Date getDate_vente() {
        return date_vente;
    }

    public void setDate_vente(Date date_vente) {
        this.date_vente = date_vente;
    }

    public double getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }

    public void ajouterV() {
    }
    public void annulerV() {
    }
    public void chercherV() {
    }

    }


