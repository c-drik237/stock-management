package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Vente;

public interface VenteRepository extends JpaRepository<Integer, Vente> {
    
}
