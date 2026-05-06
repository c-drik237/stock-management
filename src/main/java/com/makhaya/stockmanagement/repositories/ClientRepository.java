package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Client;

public interface ClientRepository extends JpaRepository<Integer, Client> {
    
}
