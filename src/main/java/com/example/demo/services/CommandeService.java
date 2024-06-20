package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.CommandeRepository;
import com.example.demo.model.Commande;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    public List<Commande> findByClient(Long idClient) {
        return commandeRepository.findByClientIdClient(idClient);
    }

    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }
}
