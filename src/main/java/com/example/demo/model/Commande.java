package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCMD;
    private LocalDate dateCMD;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany(mappedBy = "commande")
    private List<LigneCMD> ligneCMDs;

    // Getters and setters

    public Long getIdCMD() {
        return idCMD;
    }

    public void setIdCMD(Long idCMD) {
        this.idCMD = idCMD;
    }

    public LocalDate getDateCMD() {
        return dateCMD;
    }

    public void setDateCMD(LocalDate dateCMD) {
        this.dateCMD = dateCMD;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<LigneCMD> getLigneCMDs() {
        return ligneCMDs;
    }

    public void setLigneCMDs(List<LigneCMD> ligneCMDs) {
        this.ligneCMDs = ligneCMDs;
    }
}
