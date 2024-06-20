package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class LigneCMD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLigneCMD;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "idCMD")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "idProd")
    private Produit produit;

    // Getters and setters

    public Long getIdLigneCMD() {
        return idLigneCMD;
    }

    public void setIdLigneCMD(Long idLigneCMD) {
        this.idLigneCMD = idLigneCMD;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
