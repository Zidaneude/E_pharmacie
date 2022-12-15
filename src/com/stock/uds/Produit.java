package com.stock.uds;

public class Produit {
    public String description;
    public String designation;
    public float prix;
    public String conditionnement;
    public int qte_stocke;
    public int reference;

    public Produit(String description, String designation, float prix, String conditionnement, int qte_stocke, int reference) {
        this.description = description;
        this.designation = designation;
        this.prix = prix;
        this.conditionnement = conditionnement;
        this.qte_stocke = qte_stocke;
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getConditionnement() {
        return conditionnement;
    }

    public void setConditionnement(String conditionnement) {
        this.conditionnement = conditionnement;
    }

    public int getQte_stocke() {
        return qte_stocke;
    }

    public void setQte_stocke(int qte_stocke) {
        this.qte_stocke = qte_stocke;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}

