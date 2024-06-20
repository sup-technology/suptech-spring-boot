package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.ProduitService;
import com.example.demo.model.Produit;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitService.findAll();
    }

    @GetMapping("/fournisseur/{idFour}")
    public List<Produit> getProduitsByFournisseur(@PathVariable Long idFour) {
        return produitService.findByFournisseur(idFour);
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.save(produit);
    }
}
