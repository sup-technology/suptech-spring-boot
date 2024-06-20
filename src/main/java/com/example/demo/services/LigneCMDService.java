package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.LigneCMDRepository;
import com.example.demo.model.LigneCMD;

import java.util.List;

@Service
public class LigneCMDService {
    @Autowired
    private LigneCMDRepository ligneCMDRepository;

    public List<LigneCMD> findAll() {
        return ligneCMDRepository.findAll();
    }

    public List<LigneCMD> findByCommande(Long idCMD) {
        return ligneCMDRepository.findByCommandeIdCMD(idCMD);
    }

    public LigneCMD save(LigneCMD ligneCMD) {
        return ligneCMDRepository.save(ligneCMD);
    }
}
