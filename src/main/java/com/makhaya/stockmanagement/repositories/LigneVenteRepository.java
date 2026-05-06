package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.LigneVente;

public interface LigneVenteRepository extends JpaRepository<Integer, LigneVente> {
    
}
