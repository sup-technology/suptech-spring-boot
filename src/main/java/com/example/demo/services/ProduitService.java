package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.model.Produit;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    public List<Produit> findByFournisseur(Long idFour) {
        return produitRepository.findByFournisseurIdFour(idFour);
    }

    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }
}
