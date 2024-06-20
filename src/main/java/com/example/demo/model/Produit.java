package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProd;
    private String nomProd;
    private int quantiteStock;
    private double prix;

    @ManyToOne
    @JoinColumn(name = "idFour")
    @JsonIgnore
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "produit")
    private List<LigneCMD> ligneCMDs;

    public Long getIdProd() {
        return idProd;
    }

    public void setIdProd(Long idProd) {
        this.idProd = idProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public List<LigneCMD> getLigneCMDs() {
        return ligneCMDs;
    }

    public void setLigneCMDs(List<LigneCMD> ligneCMDs) {
        this.ligneCMDs = ligneCMDs;
    }
}
