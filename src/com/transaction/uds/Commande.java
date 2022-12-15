package com.transaction.uds;

import com.personnels.uds.Client;
import com.stock.uds.Produit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {
    public int reference;
    public Date date_cmd;
    public String etat;
    public Client client;
    public List<Produit> produit = new ArrayList<Produit>();

    public Commande(int reference, Date date_cmd, String etat, List<Produit> produit) {
        this.reference = reference;
        this.date_cmd = date_cmd;
        this.etat = etat;
        this.produit = produit;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public Date getDate_cmd() {
        return date_cmd;
    }

    public void setDate_cmd(Date date_cmd) {
        this.date_cmd = date_cmd;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
}
