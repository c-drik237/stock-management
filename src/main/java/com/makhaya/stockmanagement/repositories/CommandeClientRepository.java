package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
    
}
