package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.LigneCommandeFournisseur;

public interface LigneCommandeFournisseurRepository extends JpaRepository<Integer, LigneCommandeFournisseur> {
    
}
