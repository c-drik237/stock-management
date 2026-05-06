package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Integer, Fournisseur> {
    
}
