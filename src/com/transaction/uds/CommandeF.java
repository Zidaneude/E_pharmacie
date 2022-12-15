package com.transaction.uds;

import java.util.Date;

public class CommandeF {
    public String liste_produit;
    public Date date;
    public int quantite;
    public String etat;

    public CommandeF(Date date, int quantite, String etat) {
        this.date = date;
        this.quantite = quantite;
        this.etat = etat;
    }

    public String getListe_produit() {
        return liste_produit;
    }

    public void setListe_produit(String liste_produit) {
        this.liste_produit = liste_produit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void modifierCmd() {
    }
    public void annulerCmd() {
    }
    public void verifierEtat() {
    }
    public void enregistrerCmd() {
    }
    public void visualserCmd() {
    }

    public void envoyerCmd() {
    }
    public void rechercherCmd() {
    }

    public void confirmeOp() {
    }

}
