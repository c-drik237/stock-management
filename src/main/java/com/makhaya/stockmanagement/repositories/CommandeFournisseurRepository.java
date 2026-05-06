package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.CommandeFournisseur;

public interface CommandeFournisseurRepository extends JpaRepository<Integer, CommandeFournisseur> {
    
}
