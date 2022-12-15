package com.stock.uds;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    public int nbre_produit;
    public List<Produit> produit  = new ArrayList<Produit>();

    public Panier(int nbre_produit) {
        this.nbre_produit = nbre_produit;
    }

    public int getNbre_produit() {
        return nbre_produit;
    }

    public void setNbre_produit(int nbre_produit) {
        this.nbre_produit = nbre_produit;
    }
}
