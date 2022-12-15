package com.stock.uds;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    public String code;
    public String nom_categorie;
    public String famille;
    public List<Produit> produit = new ArrayList<Produit>();

    public Categorie(String code, String nom_categorie, String famille, List<Produit> produit) {
        this.code = code;
        this.nom_categorie = nom_categorie;
        this.famille = famille;
        this.produit = produit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom_categorie() {
        return nom_categorie;
    }

    public void setNom_categorie(String nom_categorie) {
        this.nom_categorie = nom_categorie;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
}
