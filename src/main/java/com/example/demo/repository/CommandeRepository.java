package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Commande;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    public List<Commande> findByClientIdClient(Long idClient);
}
