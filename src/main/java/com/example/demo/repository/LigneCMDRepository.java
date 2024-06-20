package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.LigneCMD;
import java.util.List;

public interface LigneCMDRepository extends JpaRepository<LigneCMD, Long> {
    List<LigneCMD> findByCommandeIdCMD(Long idCMD);
}
