package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.LigneCMDService;
import com.example.demo.model.LigneCMD;

import java.util.List;

@RestController
@RequestMapping("/lignecmds")
public class LigneCMDController {
    @Autowired
    private LigneCMDService ligneCMDService;

    @GetMapping
    public List<LigneCMD> getAllLigneCMDs() {
        return ligneCMDService.findAll();
    }

    @GetMapping("/commande/{idCMD}")
    public List<LigneCMD> getLigneCMDsByCommande(@PathVariable Long idCMD) {
        return ligneCMDService.findByCommande(idCMD);
    }

    @PostMapping
    public LigneCMD createLigneCMD(@RequestBody LigneCMD ligneCMD) {
        return ligneCMDService.save(ligneCMD);
    }

    // Other CRUD endpoints
}
