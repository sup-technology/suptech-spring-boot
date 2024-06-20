package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFour;
    private String nom;
    private String prenom;

    @OneToMany(mappedBy = "fournisseur")
    private List<Produit> produits;

    public Long getIdFour() {
        return idFour;
    }

    public void setIdFour(Long idFour) {
        this.idFour = idFour;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
