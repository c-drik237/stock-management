package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Integer, Utilisateur> {
    
}
