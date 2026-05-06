package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Integer, Entreprise> {
    
}
