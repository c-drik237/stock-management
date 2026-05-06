package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.LigneCommandeClient;

public interface LigneCommandeClientRepository extends JpaRepository<Integer, LigneCommandeClient> {
    
}
